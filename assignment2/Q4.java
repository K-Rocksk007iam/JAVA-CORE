package assignment2;

public class Q4 {
	private String name;
	private String address;
	private long number;
	
	public void accept()
	{
		name="Himanshu";
		address="Nashik";
		number=99885;
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("Address="+address);
		System.out.println("Number="+number);
	}

	public static void main(String[] args) {
	
		Q4 student=new Q4();
		student.accept();
		student.display();
		

	}

}
