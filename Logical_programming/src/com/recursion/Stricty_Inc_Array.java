package com.recursion;

public class Stricty_Inc_Array {
	
	 
	
	private static boolean stricty(int [] arr,int i) {
		
		if(i==arr.length-1) {
			
			System.out.println("Arry is sorted");
			
			return true;
		}
		if((arr[i]<arr[i+1])) {
			
		}
		else {
			System.out.println("Arry is not striclt sorted");
			return false ;
		}
		
		return stricty(arr,i+1);
		
		
	}

	public static void main(String[] args) {
int[] arr=new int[5];

arr = new int[] {1, 2, 3, 4, 5, 7,9,0};
System.out.println(arr.length);
		
		stricty(arr,0);
		

	}

}
