package module6;

import java.util.*;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount[] bankarr = new BankAccount[5];

		bankarr[0] = new BankAccount(1, "KUN", 230000);
		bankarr[1] = new BankAccount(2, "FAYA", 2220);
		bankarr[2] = new BankAccount(3, "KUN", 4500);
		bankarr[3] = new BankAccount(4, "FAYA", 30000);
		bankarr[4] = new BankAccount(5, "KUN", 2000);
		for (int i = 0; i < bankarr.length; i++) {
			System.out.println(bankarr[i]);
		}
		System.out.println("=--------=-----=----------=-------");

		for (int i = 0; i < bankarr.length; i++) {
			System.out.println(bankarr[i].getAccHoldername());

			System.out.println(bankarr[i].getAccNo());
			System.out.println(bankarr[i].getAccBal());
			System.out.println("=--------=-----=----------=-------");
		}

	}

}
