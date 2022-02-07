// Constructor Overloading
package learningjava;

public class Student5 {
	int id, age;
	String name;

	Student5(int i, String s) {
		id = i;
		name = s;
	}

	Student5(int i, String s, int a) {
		id = i;
		name = s;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Student5 s = new Student5(111, "Yogesh", 22);
		s.display();
		Student5 s1 = new Student5(112, "Nitin", 20);
		s1.display();


	}

}
