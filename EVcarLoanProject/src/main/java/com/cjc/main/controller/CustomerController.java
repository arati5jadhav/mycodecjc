package com.cjc.main.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.model.Customer;
import com.cjc.main.model.Document;
import com.cjc.main.service.SerCustomer;
import com.cjc.main.service.SerDocument;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class CustomerController {
	@Autowired
	SerCustomer sc;
	
	@Autowired
	SerDocument sd;
	
	
		// Register Component : Save data
		@PostMapping("/savecustomerdata")
		public String postdata(@RequestBody Customer cust) {
			System.out.println("Customer data :" + cust);
			
			
			
			if( cust.status.equalsIgnoreCase("Approved") || cust.status.equalsIgnoreCase("Rejected") ) {
				
			}else {
				cust.status = "pending";
			}
			sc.saveData(cust);

			return "Data Posted Successfully";
		}

		// Save Documents
		@PostMapping("/docupload")
		public Document uploadDoc(@RequestPart(required = true, value = "adharcard") MultipartFile f1,
				@RequestPart(required = true, value = "pancard") MultipartFile f2,
				@RequestPart(required = true, value = "signature") MultipartFile f3,
				@RequestPart(required = true, value = "photo") MultipartFile f4,
				@RequestPart(required = true, value = "incomeProof") MultipartFile f5,
				@RequestPart("cId") String doc) throws IOException {
			System.out.println("doc upload controller");
			Document alldoc = new Document();

			alldoc.setAdharcard(f1.getBytes());
			alldoc.setPancard(f2.getBytes());
			alldoc.setSignature(f3.getBytes());
			alldoc.setIncomeProof(f4.getBytes());
			alldoc.setPhoto(f5.getBytes());

			ObjectMapper om = new ObjectMapper();

			Document doc1 = om.readValue(doc, Document.class);

			System.out.println("documents" + doc1);

			alldoc.setcId(doc1.getcId());
			Document dls = sd.savedoc(alldoc);
			
			return dls;
		}

		// Get Documents by Customer-ID
		@GetMapping("/getDocs/{cId}")
		public List<Document> getDocuments(@PathVariable("cId") int custid) {

			Iterable<Document> itrdoc = sd.getDoc(custid);

			Iterator<Document> itr = itrdoc.iterator();

			Document doc = itr.next();

			List listofdoc = new ArrayList<>();

			listofdoc.add(doc);

			System.out.println("Get Docs :" + doc);

			return listofdoc;
		}

		@GetMapping("/getcustomerData")
		public List<Customer> getcustomerData() {

			Iterable<Customer> customer = sc.getcustomerData();
			Iterator<Customer> itr = customer.iterator();

			List listofcust = new ArrayList<>();

			while (itr.hasNext()) {

				Customer cust = itr.next();

				listofcust.add(cust);

			}

			return listofcust;

		}
		
		//for sanction 
		@GetMapping("/getVerifiedCustomer")
		public List<Customer> getVerifiedCustomer(){
			
			List list=new ArrayList<>();
			
			Iterable<Customer> custiterable=sc.getVerifiedCustomer();
			Iterator<Customer> listofcust=custiterable.iterator();
			
			while(listofcust.hasNext()) {
				
				Customer onecust=listofcust.next();
				System.out.println("status is:" +onecust.status);
				
				if(onecust.status.equals("Approved")) {
					
					System.out.println("Inside if");
					list.add(onecust);
					
					
					
				}
			}
			return list;
		}

//		@GetMapping("/getbyid/{cId}")
//		public Optional<Customer> getById(@PathVariable ("cId") int custid)
//		{
//			return sc.getdatabyId(custid);
//		}
	//	
//		@PutMapping("/updatecustomer")
	//   public void updateCust(@RequestBody Customer cust)
	//   {
//		   sc.editcustomer(cust);
//		  
	//   }
	//	
//		@DeleteMapping("/deleteCust/{cId}")
//		public String delCust(@PathVariable int cId)
//		{
//			sc.delcust(cId);
//			
//			return "Data Deleted Successfully";
//		}
}
