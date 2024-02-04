package assignment2;

class Address {
	String city;
	String state;
	String country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Name {
	String fname;
	String mname;
	String lname;

	public Name(String fname, String mname, String lname) {
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}
}

class Student {
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

public class TestStudent {
	public static void main(String[] args) {

		Address address1 = new Address("pune", "MAHARASHRTRA", "INDIA");
		Address address2 = new Address("mumbai", "MAHARASHRTRA", "INDIA");
		Address address3 = new Address("nashik", "MAHARASHRTRA", "INDIA");

		Name name1 = new Name("kunal", "s", "suryawanshi");
		Name name2 = new Name("aniket", "s", "suryawanshi");
		Name name3 = new Name("yash", "s", "jadhav");

		Student student1 = new Student(101, name1, address1);
		Student student2 = new Student(102, name2, address2);
		Student student3 = new Student(103, name3, address3);

		System.out.println("Student 1 Details:");
		student1.display();
		System.out.println("\nStudent 2 Details:");
		student2.display();
		System.out.println("\nStudent 3 Details:");
		student3.display();
	}
}