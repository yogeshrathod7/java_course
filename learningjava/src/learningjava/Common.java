package learningjava;

public class Common {
	
	
	public int length;
	public int width;
	public int height;
	
	
	public void setBoxDiamension(int l,int b,int h)
	{
		System.out.println("Box is created with diamensions "+l+ " "+b+" "+h+" ");
	}

	public int setLength(int l) {
		length=l;
		return length;
	}
	
	public int setWidth(int b) {
		width=b;
		return width;
	}
	
	public int setHeight(int h) {
		height=h;
		return height;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	public static void main(String[] args) {
		Common cm =new Common();
		
	}

}
