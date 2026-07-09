package clonable_object;

public class subject implements Cloneable {

	private int subid;
	private String subname;
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "subject [subid=" + subid + ", subname=" + subname + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		subject sub=(subject) super.clone();
		return subid;
		
		
	}
	
}
