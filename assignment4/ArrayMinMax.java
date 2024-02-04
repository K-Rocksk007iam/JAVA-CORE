package assignment4;

import java.util.*;

public class ArrayMinMax {

	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	int min = 10000000, max = 0, total;
	float avg;

	public void accept() {
		System.out.println("Enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int var : arr) { // ENHANCED FOR LOOP
			System.out.println(var);
			total += var;

		}
		System.out.println(total);
		System.out.println("avg :" + total / arr.length);
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println(total);
		System.out.println("avg :" + total / arr.length);
		System.out.println("MAX :" + max);
		System.out.println("MIN :" + min);
	}

	public static void main(String[] args) {
		ArrayMinMax obj = new ArrayMinMax();
		obj.accept();

	}
}
