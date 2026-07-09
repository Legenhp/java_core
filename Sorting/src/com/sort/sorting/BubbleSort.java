package com.sort.sorting;

public class BubbleSort {

	private static int[] bubble() {
		int[] arr = {8,9,9,1,6,1,5,3,2};
		
		int temp=0;
//time com=O(n^2)
//inc order
		for(int i=0;i<arr.length-1;i++) {
			
		for(int j=0;j<arr.length-1-i;j++) {
			
			
			if(arr[j]>arr[j+1]) {
			    temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		
			
			}}
		
		return arr;
			
		}
		
		
		
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=bubble();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
