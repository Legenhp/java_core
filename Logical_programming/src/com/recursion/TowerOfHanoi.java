package com.recursion;

import java.util.Stack;

public class TowerOfHanoi {
	
	
	Stack<Integer> h=new Stack<Integer>();
	static Stack<Integer> d=new Stack<Integer>();

	private static void tower(int a,String src,String helper,String dest) {
		
		if(a==1) {
			System.out.println("Move "+a+" from "+ src+" to "+ dest);
			return ;
			
		}
		
		tower(a-1,src,dest,helper);
		tower(a-1,helper,src,dest);
		System.out.println("Move "+a+" from "+" to "+ dest);
		
		
	
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tower(3,"S","H","D");

	}

}
