package com.bit.manupilation;

public class Get_bit {
	
	
	private static void get() {
		int n=5;
		
		int position=1;
		int BitMask=1<<position;
		if((BitMask & n)==0) {
			System.out.println("bit is 1");
		}
		else {
			System.out.println("bit is 0");
		}
		
		
		System.out.println((BitMask & n));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
get();
	}

}
