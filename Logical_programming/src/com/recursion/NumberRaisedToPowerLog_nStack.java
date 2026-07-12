package com.recursion;

public class NumberRaisedToPowerLog_nStack {
	
	
	private static int num(int nu,int pow) {
		if(pow==0) {
			
			return 1;
		}
		if(nu==0) {
			return 0;
		}
		if(pow==1) {
			return nu;
		}
		
		if(pow%2==0) {
		int h=num(nu,(pow/2));
		return h*h;
		}
		
		else {
			int odd= num(nu,((pow-1)/2));
			int mul= odd*odd;
					return mul*nu;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(num(5,3));
	}

}
