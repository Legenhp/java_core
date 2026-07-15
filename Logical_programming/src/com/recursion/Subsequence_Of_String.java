package com.recursion;

public class Subsequence_Of_String {
	

	private static void seq(String k,int i,String j) {
		
		if(i==k.length()) {
			return ;
			
		}
		System.out.println(j);
		
		seq(k,i+1,j);
		System.out.println(j);
		j=j+k.charAt(i);
		seq(k,i+1,j);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            seq("abc",0,"");
	}

}
