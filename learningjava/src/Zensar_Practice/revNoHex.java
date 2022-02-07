package Zensar_Practice;

import java.util.Scanner;

public class revNoHex {

	public static void main(String[] args) {

		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 9999 && number > 0) {
			while (number != 0) {
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}
			System.out.println("Reverse no " + reverse);
			System.out.println("Hexadecimal no " + Integer.toHexString(reverse));

		} else {
			System.out.println("Number is Out of Bound!");
		}

	}
}