package com.prime;

public class prime {
	
	
	
	
	public void main(int n) {
		boolean flag =true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				
				flag = false;
				break;
			}
			
			
		}
		if(flag ==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime p=new prime();
		p.main(14);

	}

}
