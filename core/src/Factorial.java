
public class Factorial {
	
	public static void main(String[] args) {
		
		System.out.println(fact(7));
		
	}

	public static int fact(int n) {
		
		for (int i=(n-1); i> 0;i--) {
			int facto = i;
			n *= facto;			
		}
		return n;
		
		
	}
}
