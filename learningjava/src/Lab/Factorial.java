package Lab;

import java.util.Scanner;

public class Factorial {
	 
	public static void main(String[] args) {
		int fact=1,number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i=0;i<number;i++) {
			fact=fact*i;
		 
		}
	System.out.println("Factorial of "+ number + " is "+fact);
	}

}
