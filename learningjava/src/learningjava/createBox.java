package learningjava;

public class createBox {

	public static void main(String[] args) {

		
		Common cm = new Common();
		// int h = cm.height=10;
		// int l = cm.length=20;
		// int b = cm.width=30;
		
		int l =cm.setLength(20);
		int b =cm.setWidth(10);
		int h =cm.setHeight(15);
		cm.setBoxDiamension(l, b, h);
		System.out.println(cm.getHeight());
		
		

	}

}
