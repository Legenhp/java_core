package com.bit.manupilation;

public class Clear_Bit {
	
	
	private static void clear() {
		
		int n=5;
		int pos=0;
		int BitMask=1<<pos;
		System.out.println(~BitMask & n);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clear();

	}

}
