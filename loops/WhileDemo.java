package loops;

import java.util.*;

public class WhileDemo {

	public static void main(String a[]) {
		int b = 2;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();

		while (b < a1) {
			a1++;
			System.out.println(a1);
		}
	}
}
