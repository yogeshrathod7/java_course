package learningjava;

public class Cat extends Animal {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.makeNoise();
	}

	// overridden method
	public void makeNoise() {
		System.out.println("Cat meows!");
	}

}
