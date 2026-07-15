package com.recursion;

public class RemoveDuplicates {
    static int arr[]=new int[26];
	private static void remove(String b,int i,String k) {
		
		
		if(i<b.length() ) {
			
			if(arr[b.charAt(i)-97]==0  ) {
				arr[b.charAt(i)-97]=1;
				k=k+b.charAt(i);
			}
			
		}
		else {
			
		
			
			System.out.println(k);
			return;
			
		}
		
		remove(b,i+1,k);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
remove("dddddddddaaabbbbbbbddaaaaaa",0,"");


	}

}
