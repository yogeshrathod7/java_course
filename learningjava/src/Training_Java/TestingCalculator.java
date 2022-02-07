package Training_Java;

import learningjava.AccessModifierA;
import learningjava.AccessModifierAA;
import learningjava.Calculator;

public class TestingCalculator {

	public static void main(String[] args) {
		
		AccessModifierA ca = new AccessModifierA();
		ca.PublicMethod();
		AccessModifierAA caa = new AccessModifierAA();
		caa.methodAA();
		

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

