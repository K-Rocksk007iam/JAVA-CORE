package constructor;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("creating obj with parameter");
		Student student = new Student();
		System.out.println(student);

		System.out.println("Enter Rollno,Name,Addres,Score=");
		int rollno = sc.nextInt();
		String name = sc.next();
		String address = sc.next();
		double score = sc.nextDouble();

		student.setRollno(rollno);
		student.setName(name);
		student.setAddress(address);
		student.setScore(score);

		System.out.println("--------------DISPLAYING THE SOLUTIONS-----------");
		//System.out.println(student);
		System.out.println("roll number is ="+student.getRollno());
		System.out.println("Name is="+student.getName());
		System.out.println("Address is="+student.getAddress());
		System.out.println("Score is="+student.getScore());
		
		System.out.println("==========================");
		System.out.println("Creating object with parameter");
		Student student2=new Student(2,"Hema","nask",5200);
		System.out.println(student2);
		
		System.out.println("================================");
		System.out.println("Changing the parameters");
		
		System.out.println("Enter new name=");
		String name1=sc.next();
		student.setName(name1);
		
		System.out.println("Enter new rollno=");
		int rollno1=sc.nextInt();
		student.setRollno(rollno1);
		
		System.out.println("Enter new Address=");
		String address1=sc.next();
		student.setAddress(address1);
		
		System.out.println("New Score is=");
		double score1=sc.nextDouble();
		student.setScore(score1);
		
		System.out.println(student);
	}
}
