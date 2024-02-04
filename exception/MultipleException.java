package exception;

import java.io.IOException;

public class MultipleException {

	private static double divide(int a, int b) {
		return (a / b);

	}

	public static void main(String[] args) throws IOException {
		
		String st1 = "100";
		String str2 = "abc";

		double result;

		try {
			int a = Integer.parseInt(st1);
			int b = Integer.parseInt(str2);

			result = divide(a, b);
			System.out.println(result);
		} catch (ArithmeticException e1) {
			System.out.println("CANNOT devide by zero");
			System.out.println(e1.getMessage());
		} catch (NumberFormatException e1) {
			System.out.println("CANNOT devide by string");
			System.out.println(e1.getMessage());
		}

		catch (Exception e) {
			System.out.println("GENERAL EXCEPTION");
			System.out.println(e.getMessage());
		}

	}

}
