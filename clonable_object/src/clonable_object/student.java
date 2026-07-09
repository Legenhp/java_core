package clonable_object;

public class student implements Cloneable{
	
	public String name;
	public int id;
	public subject sub;
	
	
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Object clone() throws CloneNotSupportedException {
	student s=(student) super.clone();
	s.sub = (subject)subject.clone();
	return s;	
	
	
		
	}
	
	
	

}
