package Training_Java;

public class StaticDemo {
	
	static int x;
	int y=55;
	
	public void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void increament() {
		x++;
		System.out.println(x);
		
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo sd = new StaticDemo();
		StaticDemo.x=25;
		sd.display();
		sd.increament();
		System.out.println("======================================AFTER INCREAMENT=====================================");
		StaticDemo sd1 = new StaticDemo();
		sd1.increament();

	}

}
