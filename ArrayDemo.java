package org.aha;

public class ArrayDemo {

	
	
	

	public static void main(String args[]) {


		int a = 10;

		String s = "jafasFASDKFAS;DJFKASDFJAJSDF;LASFLJSADLFALSDFFKLFAL";

		// status = {Open New Fixed Closed ReOpen}

		String status_Open = "Open";

		String status2 = "New";


		String status4 = "Closed";


		String status5 = "ReOpen";

		String status6 = "Complete";


		//Array - stores multiple values


		//Array object creation
		/*	String[] status = new String[]{"Open", "New", "Fixed"};

		System.out.println(status.length);

		System.out.println(status[0]);

		String status3 = status[2];

		System.out.println(status3);
		 */

		MethodDemo methodDemo = new MethodDemo();

		String[] statusArray = MethodDemo.getStatus();

		//System.out.println(statusArray.length);

		//check the length of the array before using the index
		if(statusArray.length > 2) {
			String statusOf3 = statusArray[2];
			//System.out.println(statusOf3);
		}


		//for loop
		for(int i = 0; i < statusArray.length; i++) {
			System.out.println(statusArray[i]);
		}
		
		
		for(int i =50; i < 1000; i++) {
			System.out.println(i);
		}

	}
}
