package com.cts.oops;

class Bank{

	private String actHoldName;
	private long actNumber;
	private String ifsc;
	private long addhar;
	private String pan;
	private long credit;
	private String address;
	private String nameOnCard;
	private int cvv;
	private long mobileNumber;
	private String location;
	private boolean status=true;
	
	public String getActHoldName() {
		return actHoldName;
	}
	public void setActHoldName(String actHoldName) {
		this.actHoldName = actHoldName;
	}
	public long getActNumber() {
		return actNumber;
	}
	public void setActNumber(long actNumber) {
		this.actNumber = actNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public long getAddhar() {
		return addhar;
	}
	public void setAddhar(long addhar) {
		this.addhar = addhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getCredit() {
		return credit;
	}
	public void setCredit(long credit) {
		this.credit = credit;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}

public class TestEncapsulation1 {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.setActHoldName("James Goslin");
		b.setActNumber(32154598765L);
		b.setIfsc("SBIN0012015");
		b.setAddhar(12324569875L);
		b.setPan("ELNAO4715A");
		b.setCredit(1236547896L);
		b.setAddress("DLF Gachibowli");
		b.setNameOnCard("James");
		b.setCvv(1122);
		b.setMobileNumber(4578963251L);
		b.setLocation("Gachibowli");
		b.setStatus(true);
		
		System.out.println("\n------------------------------------");
		System.out.println("            Bank Details              ");
		System.out.println("------------------------------------");
		System.out.println("\nAccount Holder Name : "+b.getActHoldName()+"\nAccount Number      : "+b.getActNumber()+"\nIFSC Code           : "+b.getIfsc()+"\nAddhar Card No.     : "+b.getAddhar()+"\nPan Card No.        : "+b.getPan()+"\nCredit Card No.     : "+b.getCredit()+"\nAddress             : "+b.getAddress()+"\nName on Card        : "+b.getNameOnCard()+"\nCVV                 : "+b.getCvv()+"\nMobile Number       : "+b.getMobileNumber()+"\nLocation            : "+b.getLocation());
		if(b.isStatus()==true)
		System.out.println("Account Status      : Active");
		else
		System.out.println("Account Status      : Inactive");
	}
}
