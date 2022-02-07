package learningjava;

class Circle1 implements Shapes1 {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
		c.drawShape();
		c.colorShape();
		c.moveShape();
	}

	@Override
	public void drawShape() {
		System.out.println("Draw circle");

	}

	@Override
	public void colorShape() {
		System.out.println("color circle");

	}

	@Override
	public void moveShape() {
		System.out.println("move circle");

	}

}
