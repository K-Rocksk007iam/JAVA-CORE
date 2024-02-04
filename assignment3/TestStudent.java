package assignment3;

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
