package com.nested_local_class;

public class D {

	public void main() {
		
		class c{
			
			int a=100;
		}
		c c=new c();
		System.out.println(c.a);
	}
}
