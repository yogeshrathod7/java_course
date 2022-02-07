package learningjava;
import java.util.Scanner;

public class Calculator {

	 int x;
	 int y;
	 int sum,sub,div,mult;
	 
	 
	 
	 public void AcceptDetails() {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter the first No");
		 x = sc.nextInt();
		 System.out.println("enter the Second No");
		 y = sc.nextInt();
		 
		 
	 }

	 
	 public void PerformAction() {
		 sum =x + y;
		 sub= x-y;
		 mult=x*y;
		 div=x/y;
		 
		 
		 
	 }
	 
	 public void ShowDetail() {
		 System.out.println("ADDITION:"+sum);
		 System.out.println("SUBSTRACTION:"+sub);
		 System.out.println("Multiplication:"+mult);
		 
		 
	 }
}
