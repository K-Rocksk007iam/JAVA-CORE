package module1;

public class Student {
	
	private int rollNo;
	private String name;
	private String address;
	public double score;
	
	public void get() {
		System.out.println("Get the information");
	}
	
	public void show() {
		System.out.println("Displaying the information");
		System.out.println("Rollno	: "+rollNo);
		System.out.println("Name	: "+name);
		System.out.println("Address	: "+address);
		System.out.println("Score	: "+score);
		
	}
	
	public void attendace() {
		System.out.println("Attendance is marked");
	}
	public void attendTheClass() {
		System.out.println("Attending the class");
	}
	public void feesStatus() {
		System.out.println("Fees is Paid");
	}
	
	
	public static void main(String[] args) {
		Student obj=new Student();
		Student obj2=new Student();
		Student obj3=new Student();
		Student obj4=new Student();
		
		
		System.out.println("Information of student");
		System.out.println("-------------------------------------");
		obj.rollNo=01;
		obj.name="kunal";
		obj.address="Nashik";
		obj.score=88;
		obj.get(); obj.show();obj.attendace();obj.attendTheClass();obj.feesStatus();
		System.out.println("-------------------------------------");
		System.out.println("Information of second student");
		System.out.println("-------------------------------------");
		
		obj2.rollNo=02;
		obj2.name="Tunal";
		obj2.address="Pune";
		obj2.score=85;
		obj2.get(); obj2.show();obj2.attendace();obj2.attendTheClass();obj2.feesStatus();
		
		System.out.println("-------------------------------------");
		System.out.println("Information of Third student");
		System.out.println("-------------------------------------");
		
		obj3.rollNo=03;
		obj3.name="hunal";
		obj3.address="mumbai";
		obj3.score=90;
		obj3.get(); obj3.show();obj3.attendace();obj3.attendTheClass();obj3.feesStatus();
		
		System.out.println("-------------------------------------");
		System.out.println("Information of Fourth student");
		System.out.println("-------------------------------------");
		
		obj4.rollNo=04;
		obj4.name="yual";
		obj4.address="Banglore";
		obj4.score=90;
		obj4.get(); obj4.show();obj4.attendace();obj4.attendTheClass();obj4.feesStatus();

	}

}
