package com.bit.manupilation;

public class SetBit {

	private static void set() {
		int n=5;
		int pos=1;
		int BitMask=1<<pos;
		System.out.println(BitMask);
		
		System.out.println(BitMask|n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set();

	}

}
