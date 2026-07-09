package com.star;

public class ButterflyPattern {
	

	
	public static void  butter() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			
				System.out.print("* ");
			}
			
			for(int k=1;k<=2*(n-i);k++) {
				System.out.print("  ");
					
				}
				
			for(int h=1;h<=i;h++) {
					System.out.print("* ");
				}
				
				System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
				}
			for(int k=1;k<=2*(n-i);k++) {
				System.out.print("  ");
				
			}
			for(int h=1;h<=i;h++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		butter();
		
	}

}
