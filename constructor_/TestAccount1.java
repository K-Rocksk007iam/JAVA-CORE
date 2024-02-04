package constructor_;

import java.util.*;

public class TestAccount1 {

	public static void main(String[] args) {
		Account1 account = new Account1();
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE ACCOUNT NUMBER , NAME, BALANCE");

		System.out.print("ENTER THE ACCOUNT NUMBER : ");
		int accNo = sc.nextInt();
		System.out.print("ENTER THE NAME : ");
		String name = sc.next();
		System.out.print("ENTER THE BALANCE : ");
		double accBal = sc.nextInt();

//		if(account.checkName(name)) {
//			System.out.println("VALID");
//		}
//		else {

//			System.out.println("INAVLID");
//		}
//		

		if (account.checkAll(accNo, name, accBal)) {
			System.out.println("inputs are valid");
		} else {
			System.out.println("inputs are invalid");
		}

	}

}
