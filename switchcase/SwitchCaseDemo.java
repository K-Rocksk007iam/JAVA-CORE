package switchcase;

import java.util.*;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String choice;

		do {
			System.out.println("\tWELCOME TO CHAPRI BANK \n");
			System.out.println("\t 1 . Accept");
			System.out.println("\t 2 . Display");
			System.out.println("\t 3 . Deposit");
			System.out.println("\t 4 . Withdraw");
			System.out.println("\t 5 . Transfer");
			System.out.println("\t 6 . Exit");

			System.out.print("Enter Choice : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("1 . Accept");
				break;

			case 2:
				System.out.println("2 . Display");
				break;

			case 3:
				System.out.println("3 . Deposit");
				break;

			case 4:
				System.out.println("4 . Withdraw");
				break;

			case 5:
				System.out.println("5 . Transfer");
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid");

			}
			System.out.println("Do you want to continue ? if yes press Y/y");
			choice = sc.next();
		} while (choice.equals("Y") || choice.equals("y"));

		System.out.println("THANKS FOR VISITING");
	}

}
