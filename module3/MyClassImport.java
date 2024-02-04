package module3;

import module2.Student;
import module2.Employee;

public class MyClassImport {

	public static void main(String[] args) {
		Student obj = new Student();
		Employee obj1 = new Employee();
		obj.rollNo = 01;
		obj.name = "kunal";
		obj.address = "Nashik";
		obj.score = 88;
		obj.get();
		obj.show();
		obj.attendace();
		obj.attendTheClass();
		obj.feesStatus();
		System.out.println("-------------------------------------\n");

		obj1.empNo = 11;
		obj1.name = "Tunal";
		obj1.salary = 55000;
		obj1.desg = "Tester";
		obj1.accept();
		obj1.display();
		obj1.checkSal();
		obj1.applyLeave();
		System.out.println("-------------------------------------");

	}

}
