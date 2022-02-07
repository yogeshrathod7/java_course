package learningjava;

public class methodOverloading {

	public static void main(String[] args) {
		methodOverloading mo = new methodOverloading();
		mo.login(12345, "PASSWORD");
		// TODO Auto-generated method stub

	}

	public void login(String s, String p) {
		System.out.println("Login using username and password !");
	}

	public void login(int s, String p) {
		System.out.println("Login using Phone number and password !");
	}

	public void login(int s, String p, int t) {
		System.out.println("Login using Phone,number password and pin!");
	}

}
