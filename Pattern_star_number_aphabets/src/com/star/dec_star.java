package com.star;

public class dec_star {
	
	
	public void star() {
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("& ");
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dec_star s=new dec_star();
		s.star();

	}

}
