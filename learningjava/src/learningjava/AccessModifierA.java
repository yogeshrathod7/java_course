package learningjava;

public class AccessModifierA {
	
	public int publicvariable = 1;
	int defaultvariable = 2;
	private int protectedvariable =4;
	
	
	
	public void PublicMethod() {
		System.out.println("Public Method!");
		
	}
	
	void DefaultMethod() {
		System.out.println("Default Method");
		
	}
	
	void ProtectedMethod() {
		System.out.println("Protected Method");
		
	}
}

