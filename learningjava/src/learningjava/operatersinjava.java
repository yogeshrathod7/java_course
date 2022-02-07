package learningjava;

public class operatersinjava {
	public static void main(String[] args) {
		
	

	int myNumber = 10;
	int number1 = 10;
	int number2 = 20;
	number1++;
	number2++;
	String str1="String demo";
	boolean bool = !true;
	 
	if (number1==number2)
	{
		System.out.println("numbers are equal");
		
	}
	
	else if((number1==10) && (number2==20)) {
		System.out.println("This is a conditional Operater");
		
	}
	
	System.out.println(bool);
	System.out.println(number1+number2);
	System.out.println(number1/number2);
	System.out.println(number1+str1);
	
	}
}
