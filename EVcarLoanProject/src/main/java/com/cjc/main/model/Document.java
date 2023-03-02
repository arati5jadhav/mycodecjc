package com.cjc.main.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int documentId;
	private int cId;
	private String customerName;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] incomeProof;
//	public int getDocumentId() {
//		return documentId;
//	}
//	public void setDocumentId(int documentId) {
//		this.documentId = documentId;
//	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public byte[] getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(byte[] adharcard) {
		this.adharcard = adharcard;
	}
	public byte[] getPancard() {
		return pancard;
	}
	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getIncomeProof() {
		return incomeProof;
	}
	public void setIncomeProof(byte[] incomeProof) {
		this.incomeProof = incomeProof;
	}
	@Override
	public String toString() {
		return "Document [ cId=" + cId + ", customerName=" + customerName
				+ ", adharcard=" + Arrays.toString(adharcard) + ", pancard=" + Arrays.toString(pancard) + ", signature="
				+ Arrays.toString(signature) + ", photo=" + Arrays.toString(photo) + ", incomeProof="
				+ Arrays.toString(incomeProof) + "]";
	}

	

}
