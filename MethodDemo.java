package org.aha;

public class MethodDemo {

	// To create a method we need Access specifiers & return type & methodName & optional (Parameter)

	//Access Specifier - public private, protect, default
	
	//Return Type is mandatory 
	
	//Method Name - Mandatory - should start with small letter
	
	//Can have Parameters or no parameters
	
	
	//returning nothing
	public void printMyName() {
		System.out.println("my name is suresh");
	}
	
	//returning boolean
	public boolean isTested() {
		
		return false;
	}
	
	//returning String
	private String getText() {
		
		return "madhu";
	}
	
	//returning int
	private int getNumber() {
		
		return 45;
	}
	
	//returning boolean
	public boolean connected() {
		
		return false;
	}
	
    private int sum(int x, int y) {
    	return x + y;
    	    	
    }
    
    private String strCombine(String s1, String s2) {
    	return "USA-" + s1.concat(s2);
    }
    
    
    
    public static void main(String ars[]) {
    	
    	MethodDemo m = new MethodDemo();
    	
    	System.out.println(m.strCombine("Jana ", "Venu"));
    	System.out.println(m.sum(34343, 565656));
    	System.out.println(m.connected());
    	m.printMyName();
    	
    }
    
    public String applyCreditCard(String ssn) {
    	
    	//own logic to give the card or approvaa
    	return "thanks for applying we need to do more checks and we will get back to you in 3 business days";
    }
    
    
    public String getHoroscopt(String name, String dob, String pob, String email) {
    	System.out.println("thanks for giving info");
    	//write your own logic
    	return "thanks for info you would get an email";
    }
	
	
}




