package learningjava;

public class TestingCalculator {

	public static void main(String[] args) {
		
		

		Calculator obj1 = new Calculator();
		 obj1.AcceptDetails();
		 obj1.PerformAction();
		 obj1.ShowDetail();
		 
		 System.out.println(">>>>>Through Second Object<<<<<");
		 
		 
		 Calculator obj2 = new Calculator();
		 obj2.AcceptDetails();
		 obj2.PerformAction();
		 obj2.ShowDetail();
	}

}
