package learningjava;

public class Child extends Parent {
	String empName = "Abbe";
	int empNo = 4321;

	public Child() {
		super(3);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.getDeta();

	}

	public void getDeta() {

		System.out.println(super.empName);
		System.out.println(super.empNo);
	}

}
