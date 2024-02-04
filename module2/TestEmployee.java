package module2;

public class TestEmployee {
	public static void main(String args[]) {
		Employee obj = new Employee();
		Employee obj1 = new Employee();
		System.out.println("-------------------------------------");
		obj.empNo = 11;
		obj.name = "Sagar";
		obj.salary = 50000;
		obj.desg = "DEVELOPER";
		obj.address = "Nashik";
		obj.accept();
		obj.display();
		obj.checkSal();
		obj.applyLeave();

		System.out.println("-------------------------------------");

		obj1.empNo = 22;
		obj1.name = "manish";
		obj1.salary = 45000;
		obj1.desg = "Tester";
		obj1.address = "Pune";
		obj1.accept();
		obj1.display();
		obj1.checkSal();
		obj1.applyLeave();

		System.out.println("-------------------------------------");
	}
}
