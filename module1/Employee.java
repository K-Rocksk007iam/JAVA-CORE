package module1;

public class Employee {
	private int empNo;
	private String name;
	private double salary;
	private String desg;
	
	public void accept() {
		System.out.println("Accept The Information\n	and		");
	}
	
	public void display() {
		System.out.println("Displaying the information\n");
		System.out.println("employee number		: "+empNo);
		System.out.println("Name			: "+name);
		System.out.println("Salaray			: "+salary);
		System.out.println("Designation		: "+desg);
	}
	
	public void checkSal() {
		
		System.out.println("Salaray	of the employee Is: "+salary);
		
	}
	
	public void applyLeave() {
		
		System.out.println("ID :"+empNo+" name :"+" "+name+" Empoyee is applying for leave");
		
	}
	
	

	public static void main(String[] args) {
		Employee obj=new Employee(); Employee obj1=new Employee(); Employee obj2=new Employee(); 
		System.out.println("-------------------------------------");
		obj.empNo=01;
		obj.name="kunal";
		obj.salary=90000;
		obj.desg="DEVELOPER";
		obj.accept();obj.display();obj.checkSal();obj.applyLeave();
		System.out.println("-------------------------------------");
		
		obj1.empNo=11;
		obj1.name="Tunal";
		obj1.salary=55000;
		obj1.desg="Tester";
		obj1.accept();obj1.display();obj1.checkSal();obj1.applyLeave();
		System.out.println("-------------------------------------");
		
		obj2.empNo=23;
		obj2.name="Yunal";
		obj2.salary=40000;
		obj2.desg="Junior Developer";
		obj2.accept();obj2.display();obj2.checkSal();obj2.applyLeave();
		System.out.println("-------------------------------------");
	}

}
