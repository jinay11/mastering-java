package oops;

public class ConstructorEx {

	String name;
	int age;

	// default
	// public ConstructorEx() {
	// System.out.println("This is the default constructor");
	// }

	// parameterized
	ConstructorEx(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// copy constructor
	public ConstructorEx(ConstructorEx e1) {
		this.name = e1.name;
		this.age = e1.age;
	}

	void display() {
		System.out.println("Welcome " + name + " you are a " + age + " years old");
	}

	public static void main(String[] args) {

//		ConstructorEx c = new ConstructorEx();

		ConstructorEx c1 = new ConstructorEx("jon", 21);
		c1.display();
		
		System.out.println();
		
		ConstructorEx c2 = new ConstructorEx(c1);
		c2.display();
	}
}