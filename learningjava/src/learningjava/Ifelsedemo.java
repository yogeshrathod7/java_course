package learningjava;

public class Ifelsedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=10;
		int num2=20;
		int num3=30;
		
		if(num1>num2) {
			System.out.println("num1 is greater than num2");
			if (num2>num3) {
				System.out.println("In a nested num2 is greater than num3");
			}
			else{
					System.out.println("In a nested  ");
				}
		}
		else if(num1==num2) {
			System.out.println("num1 is equal to num2");
		}
		else if(num1<num2) {
			System.out.println("num1 is less than num2");
		}
		
		else {
			System.out.println("finished");
		}
		
	}

}
