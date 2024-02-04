package loops;

public class IfDemo {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 10;
		c = 25;

		if (a != b) {
			System.out.println("A is not equal to B");
		}

		if (a == b) {
			System.out.println("A is equal to B");
		}

		if (a > b && a > c) {
			System.out.println("A is greatest");
		}

		else if (b > a && b > c) {
			System.out.println("B is greatest");
		}

		else {
			System.out.println("C is greatest");
		}

	}

}
