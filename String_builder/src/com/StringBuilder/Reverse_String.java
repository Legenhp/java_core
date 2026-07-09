package com.StringBuilder;

public class Reverse_String {
	
	private static StringBuilder reverse(String str) {
		StringBuilder sb=new StringBuilder(str);
	
		for(int i=0;i<sb.length()/2;i++) {
			int front =i;
			int back=sb.length()-1-i;
			
			sb.setCharAt(front, sb.charAt(back));
			sb.setCharAt(back, sb.charAt(front));
			
		}
		
		return sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(reverse("12321"));
	}

}

//for(int i=str.length()-2;i>=0;i--) {
//	sb.append(sb.charAt(i));
//	sb.deleteCharAt(i);//shifts the character
//	System.out.println(sb);
//}
//return sb;
