package com.star;

public class triangle_star {

	
	public void seq() {
		
		int n=5;
		
		for(int i=1;i<=5;i++) {
			for(int y=1;y<=n-i;y++) {
				System.out.print(" ");
				
			}for(int p=1;p<=i;p++) {
				System.out.print(i+" ");
			}
			
			
			System.out.println();
			
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle_star s=new triangle_star();
		s.seq();
		

	}
	
}
//for(int i=1;i<=3;i++) {
//	if((i==1) ){
//		for(int j=1;j<=i;j++) {
//			for(int z=1;z<=5;z++) {
//				if((5+1)/2==z) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			
//		}}
//		else if((i%2!=0)) {
//			for(int j=1;j<=5;j++) {
//				if(j%2!=0) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			
//		}
//	
//		else {
//			for(int j=1;j<=5;j++) {
//				if(j%2==0) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			
//		}
//
//		
//		
//		System.out.println();
//	
//	
//}