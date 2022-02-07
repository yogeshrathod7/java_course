package Zensar_Practice;

import java.util.Scanner;

public class revNoOctal {

	public static void main(String[] args) {

		int reverse = 0;

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number > 0 && number < 9999) {
			while (number != 0) {
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}
			System.out.println("Reverse no " + reverse);
			System.out.println("Octal No " + Integer.toOctalString(reverse));

		} else {
			System.out.println("Entered no is out of limit!");
		}

	}
}
