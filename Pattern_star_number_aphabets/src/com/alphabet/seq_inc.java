package com.alphabet;

public class seq_inc {
	
	
	public void seq() {
		
		for(int i=65; i<=70;i++) {
			for(int j=65;j<=i;j++) {
			   System.out.print((char)i + " ");
				
			}
			System.out.println();
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		seq_inc s= new seq_inc();
		s.seq();
		
		
	}

}
