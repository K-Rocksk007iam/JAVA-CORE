package aggregation;

public class Employee {
	private int empNo;
	private String empName;
	private Address address; // aggregation

	public Employee(int empNo, String empName, Address address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
	}
	
	public void display() {
		System.out.println("emp no : "+empNo);
		System.out.println("emp name : "+empName);
		System.out.println("emp address : "+address.getBldName());
		System.out.println("emp address : "+address.getCity());
		System.out.println("emp address : "+address.getPincode());
	}

}
