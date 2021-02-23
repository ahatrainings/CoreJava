package org.aha;

public class StaticDemo {
	
	private StaticDemo() {
		
	}
	
	//non static method
	public static String getText() {
		
		return "some text";
	}
	
	//static method
	public static int getSum(int a, int b) {
		
		return a + b;
	}

	
	
}
