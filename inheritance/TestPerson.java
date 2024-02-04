package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("kunal", 22,'M' ,"Nashik");
		System.out.println(person);
		person.display();
		person.fun1();
		
		Student student = new Student("kunal", 22, 'M', "Nashik", 62, "Computer", 80);
		
		System.out.println(student);
		student.display();
		
		Employee empolyee = new Employee("kunal", 22, 'M', "Nashik", 62, "Computer", 80, 101, 10, 45000,"Clerk");
		System.out.println(empolyee);
		empolyee.display();
	}

}
