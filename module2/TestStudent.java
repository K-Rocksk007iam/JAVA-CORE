package module2;

public class TestStudent {
	public static void main(String args[]) {
		Student obj=new Student();
		Student obj2=new Student();
		
		obj.rollNo=01;
		obj.name="kunal";
		obj.address="Nashik";
		obj.score=88;
		obj.get(); obj.show();obj.attendace();
		obj.attendTheClass();obj.feesStatus();
		
		System.out.println("-------------------------------------");
		obj2.rollNo=02;
		obj2.name="Tunal";
		obj2.address="Pune";
		obj2.score=85;
		obj2.get(); obj2.show();obj2.attendace();obj2.attendTheClass();obj2.feesStatus();
	}
}
