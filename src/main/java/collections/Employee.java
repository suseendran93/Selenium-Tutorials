package collections;

public class Employee {

	String name;
	int id;
	String dept;
	
	 Employee(String name,int id,String dept) {
		
		this.name=name;
		this.id=id;
		this.dept=dept;
		
	}
	
	public String toString() {
		return name+" "+id+" "+dept;
	}
	
}
