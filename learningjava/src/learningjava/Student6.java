package learningjava;

public class Student6 {
	int id;
	String name;

	Student6(int i, String s) {
		id = i;
		name = s;
	}
	Student6(Student6 s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student6 s = new Student6(111, "yogesh");
		Student6 s1 = new Student6(s);
		s.display();
		s1.display();

	}

}
