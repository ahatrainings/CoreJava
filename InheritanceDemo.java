package org.aha;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Def: Acquiring the properties(methods and variables) from the super class or derived class
		//Advantages of inheritance:
		//Re usable
		//Easy to understand and implement
		
		//Only one class can inherit at a time
		

		//Tesla is sub class
		//Car is a super class
		Tesla t = new Tesla();
		
		t.entertainment();
		
		t.fuelType();
		
		t.headLights();
		
		t.steering();
		
		t.wheels();
		
		System.out.println(t.License);
		
		Car c = new Car();
		c.headLights();
		c.steering();
		
		
		HondaOdyssey h = new HondaOdyssey();
		
		h.fuelType();
		
		h.steering();
	
	}

}