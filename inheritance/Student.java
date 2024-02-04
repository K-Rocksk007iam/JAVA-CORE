package inheritance;

public class Student extends Person {
	
	
	protected int rollNo;
	protected String stream;
	protected double score;
	
	public Student(String name, int age, char gender, String address, int rollNo, String stream, double score) {
		super(name, age, gender, address);
		this.rollNo = rollNo;
		this.stream = stream;
		this.score = score;
	}
	
	protected void display() {
		super.display();
		super.fun1();
		System.out.println("Display of student class");
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stream=" + stream + ", score=" + score + ", name=" + name + ", \nage="
				+ age + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
}
