package assignment2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements for array=");
		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Total=" + sum);
		double Discount = sum * 0.1;
		double Final_total = sum + Discount;
		double Total_bill=sum-Discount;
		System.out.println("Discount=" + Discount);
		System.out.println("Grand Total=" + Final_total);
		System.out.println("Total bill="+Total_bill);

	}

}
