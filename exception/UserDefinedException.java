package exception;

import java.util.*;

class PasswordValidation extends Exception {
	public PasswordValidation(String str) {
		super(str); // calling constructor of parent class
	}
}

class ageValidation extends Exception {
	public ageValidation(String ageCheck) {
		super(ageCheck);
	}

}

public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = sc.next();

		try {
			if (password.length() <= 8) {
				throw new PasswordValidation("SHOULD BE GREATER THAN 8 CH");
			} else if (password.matches("[A-Za-z0-9]*")) {
				throw new PasswordValidation("SPECIAL CHARACTER SHOULD BE PRESENT");
			} else {
				System.out.println("LENGTH-PRESENT\nSPECIAL CHARACTER-PRESNT");
			}
			try {
				System.out.println("Enter AGE");
				int age = sc.nextInt();

				if (age < 0 || age >= 100) {
					throw new PasswordValidation("AGE should be greater than 18 and less than 100");
				} else {
					System.out.println("LENGTH-PRESENT\nSPECIAL CHARACTER-PRESNT\nAGE-PRESENT");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
