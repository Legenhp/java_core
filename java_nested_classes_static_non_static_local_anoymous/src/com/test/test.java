package com.test;

import com.aynomous_class.interface1;
import com.nested_local_class.D;
import com.nested_static_non_static.A;



public class test {
	
	public static  void main(String[] args) {
		A a=new A();
		
		A.B b=a.new B();
	//	System.out.println(b.main());
		//A.C c=new A.C();
		 D d=new D();
		 d.main();
		 
		 
		 //Aynomous ex-implements the method declared in th einterface works with abstract claseses also
		 interface1 inc=new interface1() {
			
			public void main() {
				System.out.println("halo");
				
			}
		};
		
	}

}
