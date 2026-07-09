package clonable_admin;

import clonable_object.student;

public class admin {

	
	
	public  void main(String[] args) {
		
		student s=new student();
		
		s.setId(12);
		s.setName("KAbir");
		
		
		student s1=null;
		try {
			s1= (student) s.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		
	}
}
