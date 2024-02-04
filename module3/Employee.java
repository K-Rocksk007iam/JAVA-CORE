package module3;

import java.util.*;

public class Employee {
	public int empNo;
	public String address;
	public String name;
	public double salary;
	public String desg;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the information\n");
		System.out.println("Enter the emp no");
		empNo = sc.nextInt();
		System.out.println("Enter the address");
		address = sc.next();
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the Salary");
		salary = sc.nextDouble();
		System.out.println("Enter the Designation");
		desg = sc.next();

	}

	public void display() {
		System.out.println("\nDisplaying the information\n");
		System.out.println("employee number		: " + empNo);
		System.out.println("Name			: " + name);
		System.out.println("Salaray			: " + salary);
		System.out.println("Designation		: " + desg);
		System.out.println("Address			: " + address);
	}

	public void checkSal() {

		System.out.println("Salaray	of the employee Is: " + salary);

	}

	public void applyLeave() {

		System.out.println("ID :" + empNo + " name :" + " " + name + " Empoyee is applying for leave");

	}

	public static void main(String[] args) {

	}
}
