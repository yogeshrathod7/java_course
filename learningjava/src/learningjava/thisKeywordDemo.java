package learningjava;

public class thisKeywordDemo {
	int x;
	int y;

	public thisKeywordDemo() {
		System.out.println("default");
	}

	public thisKeywordDemo(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(this.x + this.y);
		System.out.println("default");
	}

	public static void main(String[] args) {
		thisKeywordDemo tk = new thisKeywordDemo(5, 9);
		tk.getData();

	}

	public void getData() {
		System.out.println(this.x + this.y);
	}

}
