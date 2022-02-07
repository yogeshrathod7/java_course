//constructor example 
package learningjava;

public class Student4 {
	int id;
	String name;

	Student4(int i, String s) {
		id = i;
		name = s;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student4 s = new Student4(111, "yogesh");
		Student4 s1 = new Student4(112, "Nitin");
		s.display();
		s1.display();

	}

}
