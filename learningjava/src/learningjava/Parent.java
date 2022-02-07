package learningjava;

public class Parent {
	String empName = "TOM";
	int empNo = 1234;

	public Parent() {
		System.out.println("Parent constructor");

	}

	public Parent(int i) {
		System.out.println("Parameterize constructor");

	}

	public void getDeta() {

		System.out.println(empName);
		System.out.println(empNo);
	}

}
