package module5;

import java.util.*;

public class EmailValidation {

	public static boolean emailValidation(String mail) {

		int a = mail.lastIndexOf("@");
		int dot = mail.lastIndexOf(".");
		System.out.println("pos of @ : " + a);
		System.out.println("pos of . : " + dot);

		if (dot > -1 && a > -1 && a < dot) {
			System.out.println("valid");
			return true;
		} else {
			System.out.println("Invalid");
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EMAIL");
		String mail = sc.next();

		System.out.println(emailValidation(mail));

	}

}
