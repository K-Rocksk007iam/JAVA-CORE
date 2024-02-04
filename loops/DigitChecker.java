package loops;
import java.util.Scanner;

public class DigitChecker {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		if(num >=0 && num<=9) {
			System.out.println("Single Digit");
		}

		else if(num >=10 && num<=99) {
			System.out.println("Double Digit");
		}
		
		else if(num >=100 && num<=999) {
			System.out.println("Triple Digit");
		}
		
		else {
			System.out.println("Above the Triple Digit");
		}

	}

}
