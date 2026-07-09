package com.star;

public class Solid_rombus {
	
	private static void rom() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
				
			}
			for(int k=1;k<=5;k++) {
				System.out.print("* ");
				
				
			}
			System.out.println();
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rom();

	}

}
