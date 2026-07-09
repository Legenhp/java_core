package com.star;

public class inverted_triangle_star {

	public static void inver() {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
		
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inver();

	}
}
//	int k = 2;
//	for (int i = 0; i <= 2; i++) {
//		for (int j = 0; j <= 2; j++) {
//			if (j == k) {
//
//				for (int u = k; u <= 2; u++) {
//					System.out.print("* ");
//					
//				}
//				k = k - 1;
//				break;
//			} else {
//				System.out.print("  ");
//			}
//
//		}
//		System.out.println();
//	}
//	
//
//}
