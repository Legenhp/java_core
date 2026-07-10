package com.sort.sorting;

public class InsertionSort {

	
	private static int[] inser() {
		int[] arr = {8,9,9,1,6,1,5,3,2,7};
		for(int i=1;i<arr.length;i++) {
			int temp=i;
			for(int j=i-1;j>=0;j--){
				
				if(arr[j]>arr[temp]) {
					int swap=arr[temp];
					arr[temp]=arr[j];
					arr[j]=swap;
					temp=j;
				}
				
			}
			
			}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=inser();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
