package com.bit.questions;

public class CheckNumberPowerOf2 {

	private static void check() {
		
		int n=4;
		if(((n-1)& n)==0) {
			System.out.println("power of 2");
		}
		
		else {
			System.out.println("not power of 2");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		check();
	}

}
