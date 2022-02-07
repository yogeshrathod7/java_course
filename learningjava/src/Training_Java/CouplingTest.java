package Training_Java;

 

public class Consumer {
	public Consumer(ICalculator calc) {
		calc.welcome();
		calc.addition(12,4);
	}
}

public class CouplingTest {

	public static void main(String[] args) {
		
		/*
		StanderdCalculator StanderdCalc = new StanderdCalculator();
		StanderdCalc.addition(16, 4);
		StanderdCalc.display();
		
		
		ScientificCalculator ScientificCalc =new ScientificCalculator();
		ScientificCalc.addition(12,2);
		ScientificCalc.display();
		
		ProgrammerCalculator ProgrammerCalc = new ProgrammerCalculator();
		ProgrammerCalc.addition(100, 100);
		ProgrammerCalc.display();
		*/
		
		
		Consumer c1 =new Consumer(new StanderdCalculator());
		Consumer c2 =new Consumer(new StanderdCalculator());
		Consumer c3=new Consumer(new StanderdCalculator());	
		

	}

}

 