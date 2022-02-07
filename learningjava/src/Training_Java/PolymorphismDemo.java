package Training_Java;

public class PolymorphismDemo {
	
	
	public void addition(int a,int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public void addition(float a,int b) {
		float c = a + b;
		System.out.println(c);
	}
	
	public void addition(double a,int b) {
		double c = a + b;
		System.out.println(c);
	}
	
	public void addition(int a,double b) {
		double c = a+b;
		System.out.println(c);
	}

}
