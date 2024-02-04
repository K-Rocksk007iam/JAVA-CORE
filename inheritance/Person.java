package inheritance;

public class Person {

	protected String name;
	protected int age;
	protected char gender;
	protected String address;

	public Person(String name, int age, char gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	protected void display() {
		System.out.println("This is display method");
	}

	protected void fun1() {
		System.out.println("This is fun1 method");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
}
