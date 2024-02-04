package assignment3;

public class Student {
	private int rollNo;
	private Name name;
	private Address address;

	public Student(int rollNo, Name name, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Name: " + name.fname + " " + name.mname + " " + name.lname);
		System.out.println("Address: " + address.city + ", " + address.state + ", " + address.country);
	}
}
