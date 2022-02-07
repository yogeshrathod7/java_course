package Zensar_Practice;

import java.util.Scanner;

public class maxTwoAvg {

	public static void main(String[] args) {
		int max1 = 0;
		int max2 = 0;

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			if (max1 < arr[i]) {
				max2 = max1;
				max1 = arr[i];

			} else if (max2 < arr[i]) {

				max2 = arr[i];
			}
		}

		int avg = (max1 + max2) / 2;
		System.out.println("First largest is " + max1 + " Second largest is " + max2 + " and average of both is " + avg);

	}

}
