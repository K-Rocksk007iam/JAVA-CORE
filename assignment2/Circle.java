package assignment2;
import  java.util.Scanner;
public class Circle 
{	
	private double rad;
	private double area;
	 final  double PI=3.14;
	
	
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius=");
		 rad=sc.nextDouble();
		System.out.println("radius ="+ rad);
	}
	public void calculateArea() {
		 area=PI * rad * rad;
		 //System.out.println("area ="+ area);
	}
	  void displayArea() {
		System.out.println("area ="+area);
		
	}

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.accept();
		circle.calculateArea();
		circle.displayArea();
		
	}

}
