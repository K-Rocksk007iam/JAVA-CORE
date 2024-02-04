package loops;
import java.util.*;

public class UserDemo {
	private String name;
	private int userAge;
	private double sal;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.print("Enter NAME :");
		 name = sc.next();
		 System.out.print("Enter USER AGE :");
		userAge=sc.nextInt();
		System.out.print("Enter USER salaray :");
		sal=sc.nextDouble();
	}
	
	public void display() {
		System.out.println("\nNAME :"+name);
		System.out.println("USER AGE :"+userAge);
		System.out.println("SALARAY :"+sal);
	}
	
	public Boolean checkAge() {
		if(userAge<18) {
			System.out.println("NOT eligible to vote");
			return false;
		}
		else {
			System.out.println("eligible to vote");
			return true;
		}
		}
		
		
		public Boolean checkSal() {
			if(sal<2000) {
				System.out.println("salary is less than 2000");
				return false;
			}
			else {
				System.out.println("salary is greater than 2000");
				return true;
			}
	

}
		}

