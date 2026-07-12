package com.recursion;

public class NumberRaisedToPower {

	private static int num(int nu,int pow) {
		
		
		if(pow==0) {
			return 1;
		}
		
		if( nu==0) {
			return 0;
		}
		
			
			return nu* num(nu,pow-1);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(num(5, 3)); // 125
		System.out.println(num(2, 3)); // Wrong result!
        System.out.println(num(0,0));
	}

}
