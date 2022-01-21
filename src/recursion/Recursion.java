package recursion;

public class Recursion {

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n-1)); // Recursion
		}
	}
	
	static int x1 = 0, x2 = 1, x3 = 0;	
	static void fibonacci(int n) {		
		if (n>0) {
			x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
			System.out.print("," + x3);	
			fibonacci(n-1); // Recursion
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(10));
		
		int n = 15;
		System.out.print(x1 + "," + x2);
		fibonacci(n - 2);
		
	}

}
