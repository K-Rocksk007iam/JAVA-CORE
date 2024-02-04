package inheritance;

public class Employee extends Student{
	protected int empNo;
	protected int deptNo;
	protected double sal;
	protected String desg;
	
	public Employee(String name, int age, char gender, String address, int rollNo, String stream, double score,
			int empNo, int deptNo, double sal, String desg) {
		super(name, age, gender, address, rollNo, stream, score);
		this.empNo = empNo;
		this.deptNo = deptNo;
		this.sal = sal;
		this.desg = desg;
	}
	
	protected void display() {
		super.display();
		super.fun1();
		System.out.println("Display of Employee class");
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", deptNo=" + deptNo + ", sal=" + sal + ", desg=" + desg + ", \nrollNo="
				+ rollNo + ", stream=" + stream + ", score=" + score + ",\nname=" + name + ", age=" + age + ", gender="
				+ gender + ", address=" + address + "]";
	}
	
	
}
