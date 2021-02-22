package org.aha;

public class Zoo {

	public static void main(String[] args) {

		//Object creation - Object is an instance of a class
		
		Lion lion = new Lion();
		
		lion.barking();
		lion.sleeping();
		System.out.println("Age :: " + lion.age);
		
		Lion lion2 = new Lion();
		
		lion2.sleeping();

		Lion lion3 = new Lion();
		
		Lion lion4 = new Lion();

		Lion lion5 = new Lion();

		
		
		//create an object
		Tortoise t = new Tortoise();
		
		t.barking();
		t.sleeping();
		
		System.out.println("Age :: " + t.age);

		
		
	}

}
