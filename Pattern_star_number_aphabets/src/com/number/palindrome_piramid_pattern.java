package com.number;

public class palindrome_piramid_pattern {
	
	private static void pali() {
		int n=4;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4-i;j++) {
				System.out.print("  ");
				
			}
			
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			
			for(int u=2;u<=i;u++) {
				System.out.print(u+" ");
				
		
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pali();

	}

}
