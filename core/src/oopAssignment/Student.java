package oopAssignment;

public class Student {
	
	String name;
	String ssn;
	private static int Id;
	
	Student(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	public String email() {
		
		
		String email = this.name + "@gmail.com";
		return email;
	}
	
	public void setId(int Id) {
		this.Id = Id;
		
	}
	
	public String getId() {
		
		
		String Uid = this.Id + "1000" + this.ssn.substring(6, 10);
		return Uid;
		
	}
}
