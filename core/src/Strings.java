
public class Strings {
	public static void main(String[] args) {
		
		String book = "Lord of the rings";
		
		if(book.contains("lord")) {
			System.out.println("the book contains Lord");
			
		} else System.out.println("not found");
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("the  browser is chrome");
		}else System.out.println("not found");
		
		String fName = "abhilash";
		String lName = "kotagiri";
		
		System.out.println("your email is " + ":  " + fName.substring(0, 4) + lName.substring(0, 1)+"@gmail.com");
		System.out.println("the length of first name is : " + fName.length());
		
		
	}

}
