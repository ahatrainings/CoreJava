package org.aha;

public class Donation {

	//Home work Enhance the class by adding more constructors
	int donation = 10;
	String name = "";
	String reason = "No Reason";
	
	public Donation(int donation) {
		//setting in class variable
		this.donation = donation;
		
	}
	
	//parameterized constructor
	public Donation(int donation, String name) {
		//setting in class variable
		this.donation = donation;
		this.name = name;
	}
	
		public Donation(int donation, String name, String reason) {
			//setting in class variable
			this.donation = donation;
			this.name = name;
			this.reason = reason;
			
		}
		
		
	
	
	
	
	public void printDonation() {
		System.out.println(name + ": donating $" + donation + " Reason is "+ reason);
		
		//store it in DB
		
	}
	
	
	/*
	public void printDonation1(int donation) {
		System.out.println(name + ": donating $" + donation + " Reason is "+ reason);
		
		//store it in DB
		
	}
	
	public void printDonation2(int donation, String name) {
		System.out.println(name + ": donating $" + donation + " Reason is "+ reason);
		
		//store it in DB
		
	}
	
	public void printDonation3(int donation, String name, String reason) {
		System.out.println(name + ": donating $" + donation + " Reason is "+ reason);
		
		//store it in DB
		
	}
	*/
	
	
}
