package learningjava;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primary_diagonal =0;int secondary_diagonal=0;
		System.out.println("Eneter the array length \n");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		System.out.println("Enter the array element \n");
		int arr[][] = new int[len][len];
		for (int i = 0; i<len;i++) {
			for (int j=0;j<len;j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		
		for (int k = 0; k<len;k++) {
			for (int l=0;l<len;l++) {
				
				if(k==l) {
					System.out.println(arr[k][l]);
					primary_diagonal=primary_diagonal+arr[k][l];
					
				}
				
				
			}
		}
		
		
		for (int k = 0; k<len;k++) {
			for (int l=0;l<len;l++) {
				
				if(k+l==len-1) {
					System.out.println(arr[k][l]);
					secondary_diagonal+=arr[k][l];
				}
				
				
			}
		}
		System.out.println("Sum of diagonal element is "+primary_diagonal);
		System.out.println("Sum of Secondary element is "+secondary_diagonal);
		
	}

}
