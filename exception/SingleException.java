package exception;
import java.util.*;

public class SingleException {

	public static double divide(int a, int b) {
		return (a / b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers\n");
		try {
			System.out.println(divide(sc.nextInt(), sc.nextInt()));
		} catch (ArithmeticException e) {
			System.out.println("CANT divide any number by zero");
			System.out.println("---------------------\n");
			e.printStackTrace();
			System.out.println("---------------------\n");
			System.out.println(e);
			System.out.println("---------------------\n");
			System.out.println(e.getMessage());
			System.out.println("---------------------\n");
		}
		
		finally {
			System.out.println("Finally Block will execute always");
		}
	}

}
