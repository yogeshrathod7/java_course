package learningjava;

public class ClassAA extends ClassA{

  public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		ca.DefaultMethod();
		ClassAA caa = new ClassAA();
		caa.ProtectedMethod();
		 
	}
   public void methodAA() {
	   System.out.println("Public Method AA");
   }

}
