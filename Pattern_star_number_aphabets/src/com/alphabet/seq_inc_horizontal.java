package com.alphabet;

public class seq_inc_horizontal {
	
	
	public void seq() {
		for(int i=65;i<=70;i++) {
			for(int j=65;j<=i;j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seq_inc_horizontal s=new seq_inc_horizontal();
		s.seq();

	}

}
