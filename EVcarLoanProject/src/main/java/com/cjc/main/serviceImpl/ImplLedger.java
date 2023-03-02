package com.cjc.main.serviceImpl;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.EmiDetails;
import com.cjc.main.model.Ledger;
import com.cjc.main.repository.RepoCustomer;
import com.cjc.main.repository.RepoEmiDetail;
import com.cjc.main.repository.RepoEnquiryDetails;
import com.cjc.main.repository.RepoLedger;
import com.cjc.main.service.SerLedger;
//import com.cjc.main.service.SerLedger;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class ImplLedger implements SerLedger{
	
	@Autowired
	RepoLedger lr;
	
	@Autowired
	RepoEmiDetail er;

	@Override
	public Ledger saveData(Ledger ledg)
	{
		lr.save(ledg);
		return ledg;
	}

	@Override
	public Iterable<Ledger> getAllLedger()
	{
		return lr.findAll();
	}

	@Override
	public void generateExel(HttpServletResponse response) {
		
		Iterable<EmiDetails> custemi=er.findAll();
		
		HSSFWorkbook wbook =new HSSFWorkbook();//creating new sheets
		HSSFSheet sheet=wbook.createSheet();
		HSSFRow row=sheet.createRow(0);
		
		HSSFFont headfont=wbook.createFont();
		headfont.setColor(IndexedColors.WHITE.index);
		
		CellStyle headerCellStyle=sheet.getWorkbook().createCellStyle();
		headerCellStyle.setDataFormat(wbook.createDataFormat().getFormat("#.##"));
		
		
		headerCellStyle.setFillForegroundColor(IndexedColors.LIME.index);
		 headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		  headerCellStyle.setFont(headfont);
		 
		HSSFCell cell1=row.createCell(0);
		cell1.setCellValue("EMI_ID");
		cell1.setCellStyle(headerCellStyle);
		
		HSSFCell cell2=row.createCell(1);
		cell2.setCellValue("EMI_AmountMonthly");
		cell2.setCellStyle(headerCellStyle);
		
		HSSFCell cell3=row.createCell(2);
		cell3.setCellValue("EMI_DueDate");
		cell3.setCellStyle(headerCellStyle);
		
		
		HSSFCell cell4=row.createCell(3);
		cell4.setCellValue("EMI_Status");
		cell4.setCellStyle(headerCellStyle);
		
		
//		header.createCell(0).setCellValue("EMI_ID");
//		header.createCell(1).setCellValue("EMI_AmountMonthly");//create row with names
//		header.createCell(2).setCellValue("EMI_DueDate");
//		header.createCell(3).setCellValue("EMI_Status");
		
		int i=1;//row number
		for(EmiDetails ei:custemi)
		{
			HSSFRow data=sheet.createRow(i);
			data.createCell(0).setCellValue(String.valueOf(i));
			data.createCell(1).setCellValue(ei.getEmiId());
			data.createCell(1).setCellValue(ei.getEmailid());
			data.createCell(2).setCellValue(ei.getEmiAmountMonthly());
			data.createCell(2).setCellValue(ei.getNextemiduedate());
			data.createCell(3).setCellValue(ei.getPreviousemistatus());
			i++;
		}
		ServletOutputStream stream;
		
		try {
			stream = response.getOutputStream();
			wbook.write(stream);
			wbook.close();
			stream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void generatePdf(HttpServletResponse response1) {
Iterable<EmiDetails> emipdf=er.findAll();
		
		
		Document doc1=new Document(PageSize.A4);
		try {
			PdfWriter.getInstance(doc1, response1.getOutputStream());
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		doc1.open();
		
		PdfPCell cell=new PdfPCell();
		cell.setBackgroundColor(Color.white);
		cell.setPadding(5);
		
		Font headlinefont=FontFactory.getFont(FontFactory.TIMES_BOLD);
		headlinefont.setSize(16);
		headlinefont.setColor(Color.RED);
		
		
		Font listfont=FontFactory.getFont(FontFactory.TIMES_BOLD);
		listfont.setSize(10);
		listfont.setColor(Color.BLACK);
		
		PdfPTable table=new PdfPTable(4);
		cell.setPhrase(new Phrase("EMI_ID",headlinefont));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("EMI_AmountMonthly",headlinefont));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("EMI_DueDate",headlinefont));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("EMI_Status",headlinefont));
		table.addCell(cell);

		int i=1;
		for(EmiDetails ee:emipdf)
		{
			table.addCell(String.valueOf(i));
			table.addCell(String.valueOf(ee.getEmiAmountMonthly()));
			table.addCell(String.valueOf(ee.getNextemiduedate()));
			table.addCell(String.valueOf(ee.getPreviousemistatus()));
			i++;
		}
		try {
			doc1.add(table);
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
		doc1.close();
	}
	@Override
	public List<Ledger> getTheListLedger() {
		List<Ledger> u=(List<Ledger>) lr.findAll();
		return u;
	}
		
		
}


