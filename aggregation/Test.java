package aggregation;

public class Test {

	public static void main(String[] args) {
	Address add = new Address("A", "NASHIK", 422101);
	Address add1 = new Address("B", "PUNE",423101);
	Address add2 = new Address("C", "MUMBAI", 424101);
	
	Employee emp1 = new Employee(1, "kunal", add); 
	Employee emp2 = new Employee(2, "rahul", add1); 
	Employee emp3 = new Employee(3, "mau", add2);
	
	emp1.display();
	emp2.display();
	emp3.display();
	
	}

}
