package learningjava;

public class childCircle extends Circle {

	@Override
	public void drawShape() {
		System.out.println("Draw Circle");
	}

	@Override
	public void colorShape() {
		System.out.println("coloring Circle");

	}

	@Override
	public void moveShape() {
		System.out.println("Moving Circle");

	}

	public static void main(String[] args) {

		childCircle cc = new childCircle();
		cc.drawShape();
		cc.colorShape();
		cc.moveShape();
	}
}