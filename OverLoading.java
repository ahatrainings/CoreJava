package org.aha;

public class OverLoading {

	//Overload a method in java
	
	public int sum(int a, int b) {
		return a + b;
	}
	

	//compile time polymorphism 
	//method overloading with in the class
	
	//overloaded method in java
	public int sum(int a, int b, int c) {
		System.out.println("overloaded method called");
		return a + b + c;
	}
	
	//overloaded method
	public String sum(String a, String b) {
		return a.concat(b);
	}
	
}
