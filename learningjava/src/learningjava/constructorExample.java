package learningjava;

public class constructorExample {
	public constructorExample() {
		System.out.println("No argument constructor");
	}
	public constructorExample(int i) {
		System.out.println("one argument constructor");
	}
	public constructorExample(int i,String s) {
		System.out.println("two argument constructor");
	}
	public constructorExample(String s) {
		System.out.println("string argument constructor");
	}
	

	public static void main(String[] args) {
		constructorExample ce = new constructorExample(5,"yogesh");
		 
	}

}
