package Training_Java;

public class MethodsDemo1 {

	public static void main(String[] fname, String lname ) {
		System.out.println("Welcomr"+ fname + " "+lname);
		System.out.println("Hello "+fname);
		
		

	}
	
	public int square(int s) {
		int sq=s*s;
		return sq;
		
		
	}
	
	public String greet (String s) {
		return "Hello" + s + "Welcome to Java Programming";
		
	}
	   
	
	public int addition(int... args) {
		int sum =0;
		System.out.println("The Sum oF " + args.length +" numbers : ");
		for (int x: args) {
			System.out.println(x);
			sum+=x;
			
		}
		return sum;
}
	
	
	

}