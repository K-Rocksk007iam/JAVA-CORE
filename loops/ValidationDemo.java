package loops;
import java.util.*;

public class ValidationDemo {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Number Are");
		while(0<num) {
			System.out.println(num);
			num--;
		}

	}

}
