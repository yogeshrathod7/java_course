package Lab;

import java.util.*;

class asciiCount {

	 
	static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	static int sumAscii(String str, int n) {

		int sum = 0;

		for (int i = 0; i < n; i++) {

			if (isPrime(i + 1)) {
				sum += (int) (str.charAt(i));
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();

		System.out.println(sumAscii(str, n));
	}
}