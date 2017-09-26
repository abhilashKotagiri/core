package oopAssignment;

public class Joining {
	public static void main(String[] args) {
		
		Student student = new Student("abhilash", "1234567890");
		student.setId(10);
		System.out.println("the email id being: " +student.email());
		System.out.println("the user id is : " + student.getId());
	}

}
