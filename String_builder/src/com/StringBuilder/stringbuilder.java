package com.StringBuilder;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new  StringBuilder("hello w");
		
		//substring
		   
		System.out.println(sb.substring(0, 7));
	    //insert
		sb.insert(0, "A");
		System.out.println(sb);
		//charat
		System.out.println(sb.charAt(6));
		//setCharAt
		sb.setCharAt(0,' ' );
		System.out.println(sb);
		//append
	     sb.append("o");
	     sb.append("r");
	     sb.append("ld");
	     System.out.println(sb);
	     //delete 
	     sb.delete(6,12);
	     System.out.println(sb);

	}

}
