package org.aha;

public class StringBufferDemo {

	public static void main(String[] args) {

		//StringBuffer is mutable

		StringBuffer sb = new StringBuffer("Mr");

		sb.append("sachin");

		System.out.println(sb.hashCode());

		sb.append("tendulkar");

		System.out.println(sb.hashCode());
				
		System.out.println(sb);

	}

}	
