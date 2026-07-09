package com.star;

public class Star {
	
	
	private static void star() {
		int n=4;
		for(int i=1;i<=4;i++) {
			
			for(int g=1;g<=n-i;g++) {
				System.out.print("  ");
				
			}
		
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			
			
			for(int k=2;k<=i;k++) {
				System.out.print("* "); 
			}
			
			System.out.println();
		}
		
		for(int i=3;i>=1;i--) {
			
			for(int k=0;k<=3-i;k++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			for(int g=2;g<=i;g++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		star();
	}

}
