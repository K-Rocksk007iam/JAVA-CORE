package module4;
import java.util.*;

public class ArrayDemo {
	int arr[]=new int[5];
	Scanner sc= new Scanner(System.in);
	
	public  void accept() {
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	public  void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(+arr[i]);
		}
		System.out.println("------------------------------");
		
		
		for(int var : arr) {    // ENHANCED FOR LOOP
			System.out.println(var);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ArrayDemo obj=new ArrayDemo();
		obj.accept();
		obj.display();

	}

}
