package Training_Java;

public class Ractangle extends Shape{
	
	public Ractangle(int l,int b) {
		length=l;
		breadth=b;
		
	}

	@Override
	public void draw() {
		System.out.println("++++This is Rectangle++++");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		area=length*breadth;
		System.out.println("Area of Rectangle is:"+area);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SquareArea() {
		
		
		// TODO Auto-generated method stub
		
	}
	

}
