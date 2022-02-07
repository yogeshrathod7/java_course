package Zensar_Practice;

import java.util.Scanner;

public class UniqueValueArray {

	public static void main(String[] args) {
		int size =13;
		Scanner sc = new Scanner(System.in);
		
		int []arr =new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
		 System.out.println(arr[i]); 
		}


	}

}
