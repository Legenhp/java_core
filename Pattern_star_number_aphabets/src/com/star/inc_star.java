package com.star;

public class inc_star {

	public void star() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		inc_star s=new inc_star();
		s.star();
		
	} 
	
	
}
