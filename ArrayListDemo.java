
import java.util.ArrayList;

import org.aha.Lion;
import org.aha.Tesla;

//import java.lang.String;


//default java imports java.lang package


public class ArrayListDemo {
	
	public ArrayListDemo() {
		System.out.println("constructor call :::");
		nameList.add("Raj");
		nameList.add("mahdu");
		nameList.add("anu");
		nameList.add("jana");	
		System.out.println("constructor list "+ nameList);
		
	}
	
	//class var
	public ArrayList nameList = new ArrayList();
	
	//Generics
	public ArrayList <String> newList = new ArrayList <String> ();
	
	public ArrayList <StringBuffer> newBufferList = new ArrayList <StringBuffer> ();

	public ArrayList <Tesla> teslaList = new ArrayList <Tesla> ();
	
	public ArrayList <Lion> lionList = new ArrayList <Lion> ();

	
	
	//method
	public void addName(String name) {
		System.out.println("addName method call ::");
		System.out.println("printing the list before addition "+ nameList);
		nameList.add(name);
		System.out.println("printing the list after addition "+ nameList);
		System.out.println(nameList.get(2));
	}

	
	public void printList() {
		//type cast Object to String
		String name = (String)nameList.get(1);
		name = name + " is a nice person";
		nameList.add(name);
		
		System.out.println(nameList);	
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//array is static
		//array cannot add/remove in array
		//array cannot grow or shrink at runtime
		//array cannot stores multiple types 
		//faster when compare to arraylist
		
		//arraylist is dynamic
		//arraylist can grow and shrink at runtime
		//arraylist can add/remove element or objects at runtime
		//arraylist can store multiple types of objects
		
		int a[] = {1,2,3};
		
		String ss[] = new String[] {"a","b", "3"};
		
		
		//Collections is a framework in java
		
		// List, Set , Map
		
		//List = Raj - Anu - Jana - Madhu
		
		ArrayList list = new ArrayList();
		
		list.add("Raj");
		list.add("mahdu");
		list.add("anu");
		list.add("jana");
		
		//prints the size
		System.out.println(list.size());
		
		//ArrayList stores multiple type objects
		
		StringBuffer sb = new StringBuffer("suresh");
		list.add(sb);
		
		list.add(12345);
		
		Integer i = new Integer(23);
		
		list.add(i);
		
		//cannot store primitive
		int ix = 12;
		
		list.add(ix);
		
		System.out.println(list);
	
		
		

	}

}
