package com.nested_static_non_static;

public class A {
	private int a=100;
	
	public class B{
		
		public void main() {
			System.out.println(a);//can access the private member of class A
			
		}
		
		public static class C{
			
			A obj=new A();
			public void main() {
				
				System.out.println(obj.a);//can access the private  member of class A in static class C 
				
			}
			
		}
		
	}

}
