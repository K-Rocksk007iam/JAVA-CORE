package assignment;

import java.util.*;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num, count = 0, posCount = 0, negCount = 0;
		int zero_Count = 0;

		while (true){
			num = sc.nextInt();
			count++;

			if (num == 0) {
				zero_Count++;
			}

			if (num % 2 == 0) {
				posCount++;
			} else {
				negCount++;
			}

		
		
		
		System.out.println("count of zero is " + zero_Count);
		System.out.println("count of num is " + count);
		System.out.println("positive num " + posCount);
		System.out.println("negative num " + negCount);

		}}}

