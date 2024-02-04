package assignment;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("This Is factorial : "+fact);

	}

}
