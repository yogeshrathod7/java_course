package Training_Java;

public abstract class Shape {
	
	int length,breadth;
	double area;
	public void massage() {
		System.out.println("This Is the Msg From Shape Class ");
		}
	public abstract void draw();
	public abstract void calculateArea();
	public abstract void SquareArea();
	

}
