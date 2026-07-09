package com.duck_number;

import java.util.Scanner;

public class duck_no {

	Scanner sc =new Scanner(System.in);
	
	public  String duck() {
		
		
		System.out.println("How many digits:");
		int n=sc.nextInt();
		

		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			System.out.println("Enter number:");
			arr[i]=sc.nextInt();
			
		
		}
		if(arr[0]==0) {
			return "Not a duck";
			
		}
		boolean flag=false;

		for(int i=1;i<n;i++) {
			if(arr[i]==0) {
				flag=true;
				
			}
		
		
		
			
		}
		if(flag==false) {
			System.out.println("Duck not ");
		}
		
		if(flag==true)
		return "duck number";
		
		
		return null;
		
	}
	
	
	public static void  main(String [] args) {
		
		duck_no d=new duck_no();
		
		System.out.println( d.duck());
		
	}
	
	
}
