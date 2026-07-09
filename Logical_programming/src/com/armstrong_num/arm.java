package com.armstrong_num;

import java.util.Scanner;

public class arm {
	
	Scanner sc=new Scanner(System.in);
	public void armstrong(int n) {
		int og=n;
		int sum=0;
		int temp=0;
		
		
		while(n>0) {
			n=n/10;
			temp=temp+1;
		}
		
		while(n>0) {
			
			n=n%10;
			for(int i=0;i<temp;i++) {
				sum=sum+n;
				
			}
			
			n=n/10;
			
		}
		
		if(sum==og) {
			
			System.out.println("Armstrong number");
		}
		else {
			
			System.out.println("no");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arm a=new arm();
		a.armstrong(153);

	}

}
