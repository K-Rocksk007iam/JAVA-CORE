package constructor;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Creating Obj Without Parameter");
		Account account1 = new Account();                                 //default constructor
		System.out.println(account1);

		System.out.println("ENTER VALUES FOR ACCOUNT NO,ACCOUNT HOLDER NAME AND ITS BALANCE=");
		int accNo = sc.nextInt();                                             //put values in default
		String accHolder = sc.next();
		double accBal = sc.nextDouble();

		account1.setAccNO(accNo);
		account1.setAccHolder(accHolder);
		account1.setAccBal(accBal);

		System.out.println("Displaying details for account");
		System.out.println(account1);

		System.out.println("=================================");
		System.out.println("Creating Obj With Parameter");						//parameterized constructor
		Account account = new Account(10, "Raju", 50000);
		System.out.println(account);

		System.out.println("=================================");				//Withdraw amt
		System.out.println("Enter amt to withdraw=");
		double amt = sc.nextDouble();
		account.withdraw(amt);
		System.out.println("Updated Balance=" + account.getAccBal());

		System.out.println("=================================");				//deposit amt
		System.out.println("Enter amt to Deposite=");
		double amt1 = sc.nextDouble();
		account.deposite(amt1);
		System.out.println("Updated Balance=" + account.getAccBal());

		System.out.println("=================================");			//transfer amt
		System.out.println("Enter amt to Transfer=");
		double amt3 = sc.nextDouble();
		account.transfer(account1, amt3);
		System.out.println("New balance for Account 1=" + account1.getAccBal());
		System.out.println("New balance for Account 2=" + account.getAccBal());

	}

}
