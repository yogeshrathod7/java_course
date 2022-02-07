package Zensar_Practice;

import java.util.Scanner;

public class FactNumSum {

	public static void main(String[] args) {
		int fact =1,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		FactNumSum fn = new FactNumSum();
		FactNumSum.factorial(number,fact);
		FactNumSum.Sum(sum,fact);
		System.out.println("Factorial is "  +fact+ " and sum of digits is ");
		//System.out.println();

		
	}
		
		public static  void factorial(int number,int fact) {
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		}
		public static void Sum(int sum,int fact) {
	   int temp =0;
	   temp=fact;
	   
	    while (temp>0) {
		int digit=temp%10;
		sum =sum+digit;
		temp=temp%10;
		
	}
	    System.out.println(sum);
		}
	

}
