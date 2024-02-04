package collection;

public class Emp {
	private int empNo;
	private String empName;
	private double sal;
	
	public Emp() {
		empNo=0;
		empName="";
		sal=0.0;
	}
	
	public Emp(int empNo, String empName, double sal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + "]";
	}
	
	
	
}
