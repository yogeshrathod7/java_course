package learningjava;

import Training_Java.*;            

public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		md.DoLogin();
		md.DoLogout();
		
		
	// imported from another package
        PolymorphismDemo  pd = new PolymorphismDemo();
        pd.addition(3,4);
		pd.addition(21,4);
		pd.addition(5554,4);
		pd.addition(3,5654);
		 

	}
	
	public void DoLogin() {
		 
		System.out.println("Login Successfull!");
	}

	public void DoLogout() {
		
		DoLogin(); 
		System.out.println("Login Successfull!");
	}
}
