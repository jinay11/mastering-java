package oops;

class parent {
	int a = 10;

	public void show() {
		System.out.println("Parent class method");
	}

	parent() {
		System.out.println("Parent class constructor");
	}
}

class child extends parent {
	int a = 20;

	public void display(int a) {
		System.out.println(a); // 100
		System.out.println(this.a); // 20
		System.out.println(super.a); // 10
		super.show();
	}

	child() {
		super(); // calling parent class constructor
		System.out.println("Child class constructor");
	}
}

public class superKeyword {
	public static void main(String[] args) {
		child c = new child();
		c.display(100);
	}
}
