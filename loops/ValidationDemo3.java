package loops;

import java.util.Scanner;

public class ValidationDemo3 {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		for(;num1<=num2;num1++) {
			if(num1%2==0) {
				System.out.println(num1);
				
			}
		}

	}

}
