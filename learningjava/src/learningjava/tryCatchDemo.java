package learningjava;

public class tryCatchDemo {

	public static void main(String[] args) {
		 int i=20;
		 try {
			 System.out.println("Before Division");
			 System.out.println(i/0);
		 }
		 catch(Throwable t){
			 
			 System.out.println(t.getMessage());
			 System.out.println(t.getCause());
			 System.out.println(t.getStackTrace());
		 }
		 finally {
			 System.out.println("This is finally block");
		 }
		 System.out.println("Before Division");

	}

}
