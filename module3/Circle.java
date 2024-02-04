package module3;
import java.util.*;
public class Circle {
	private double radius;
	private double area;
	private double perimeter;
	
	static final float PI;
	static final double TAX;
	static final String COMPANY_NAME;
	
	static {
		PI=3.14f;
		TAX=0.1;
		COMPANY_NAME="GFG";
	}
	
	Scanner sc= new Scanner(System.in);
	
	void accept() {
		System.out.println("Enter the Radius");
		radius=sc.nextInt();
	}
	 void calArea() {
		 area=PI*radius*radius;
		
	 }
	 
	 void calPerimeter() {
		 perimeter=2*PI*radius;
		
	 }
	
	 
	 void display() {
		 System.out.println("RADIUS : "+radius);
		 System.out.println("AREA : "+area);
		 System.out.println("PERIMETER : "+perimeter);
		 System.out.println("tAX : "+TAX);
		 System.out.println("COMPANY_NAME : "+COMPANY_NAME);
	 }
	

}
