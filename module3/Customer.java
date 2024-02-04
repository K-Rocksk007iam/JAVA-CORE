package module3;

import java.util.Scanner;

class Customer {
	int custId;
	String address;
	String name;

	Scanner sc = new Scanner(System.in);

	void accept() {
		System.out.println("Enter the information\n");
		System.out.println("Enter the CustId");
		custId = sc.nextInt();
		System.out.println("Enter the address");
		address = sc.next();
		System.out.println("Enter the name");
		name = sc.next();

	}

	void display() {
		System.out.println("\nDisplaying the information\n");
		System.out.println("employee number		: " + custId);
		System.out.println("Name			: " + name);
		System.out.println("Address			: " + address);
	}

	public static void main(String[] args) {

	}
}
