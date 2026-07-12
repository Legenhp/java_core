package com.recursion;

public class String_in_reverse {

	
	static StringBuilder b=new StringBuilder("Hello");
	static int i=0;
	static int j=b.length();
	
	private static void rev(StringBuilder a) {
		if(i>j) {
			return;
		}
		char temp=a.charAt(i);
		a.setCharAt(i, a.charAt(j));
		a.setCharAt(j, temp);
		rev(a);
		System.out.println(a);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            rev(b);
	}

}
