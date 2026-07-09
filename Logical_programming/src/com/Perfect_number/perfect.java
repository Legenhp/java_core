package com.Perfect_number;

public class perfect {

	
	
	public void main(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
				sum=sum+i;
				
			}
			
		}
		if (sum==n) {
			System.out.println("perfect");
			
		}
		else {
			System.out.println("not perfect");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perfect p=new perfect();
		p.main(28);

	}

}
