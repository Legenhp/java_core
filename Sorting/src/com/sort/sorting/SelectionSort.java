package com.sort.sorting;

public class SelectionSort {

	private static int[] sel() {
		int[] arr = {8,9,9,1,6,1,5,3,2};
		
		int small=0;
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			small=i;
			for(int j=i+1;j<arr.length;j++) {
				if((arr[j]<arr[small])) {
				small=j;
				}	
			}
			if(small!=i) {
			temp=arr[small];
			arr[small]=arr[i];
			arr[i]=temp;}
		}
		return arr;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr=sel();
        for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
