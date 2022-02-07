package Training_Java;

public class FinalDemo {
	
    int x;
	int y=19;

	 public FinalDemo() {
		 x=12;
		 }
	 public final void increament() {
		 x++;
		 y++;
		 System.out.println(x);
		 System.out.println(y);
		 
	 }

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.increament();
		// TODO Auto-generated method stub

	}

}
