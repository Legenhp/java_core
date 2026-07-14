package com.recursion;

public class String_in_reverse {

	
	static StringBuilder b=new StringBuilder("Hello");
	static int i=0;
	static int j=b.length()-1;
	
	private static StringBuilder rev(StringBuilder a) {
		if(i>=j) {
			return a;
		}
		char temp=a.charAt(i);
		a.setCharAt(i, a.charAt(j));
		a.setCharAt(j, temp);
		i=i+1;
		j=j-1;
		
		return rev(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println( rev(b));
	}

}
