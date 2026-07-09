package com.number;

public class num_inc {
	int sum=0;
	
	public void seq() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				sum =sum+1;
				System.out.print(sum+" ");
				
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num_inc n=new num_inc();
		n.seq();

	}

}

//for(int i=1;i<=5;i++) {
//	
//	for(int j=1;j<=i;j++) {
//		sum++;
//		System.out.print(sum +" ");
//		
//	}
//	System.out.println();
//}
