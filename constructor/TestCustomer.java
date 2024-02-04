package constructor;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println(customer);

		System.out.println("Enter custId,custName and custAddress=");
		int custId = sc.nextInt();
		String custName = sc.next();
		String custAddress = sc.next();

		customer.setCustId(custId);
		customer.setCustName(custName);
		customer.setCustAddress(custAddress);
		System.out.println(customer);

		Customer customer1 = new Customer(1, "Raj", "nsk");
		System.out.println(customer1);

		System.out.println("================================");
		System.out.println("Changing the parameters");
		System.out.println("Enter new rollno=");
		int custId1 = sc.nextInt();
		customer1.setCustId(custId1);

		System.out.println("Enter new name=");
		String custName1 = sc.next();
		customer1.setCustName(custName1);

		System.out.println("Enter new Address=");
		String address1 = sc.next();
		customer1.setCustAddress(address1);
		System.out.println(customer1);

	}

}
