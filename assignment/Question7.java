package assignment;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.println("Not prime");
		}
		
		else if(num%2!=0 && num%num==0) {
			System.out.println("Prime number");
			
		}
		else {
			System.out.println("Not prime");
		}

	}

}
