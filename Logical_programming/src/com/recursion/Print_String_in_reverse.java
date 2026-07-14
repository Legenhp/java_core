package com.recursion;

public class Print_String_in_reverse {

	private static void rev(String a,int i) {
		
		if(i==0) {
			System.out.println(a.charAt(i));
			return;
			
		}
		System.out.println(a.charAt(i));
		rev(a,i-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hee";
		rev(s,s.length()-1);

	}

}
