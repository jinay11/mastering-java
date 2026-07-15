package oops;

class Example {

	int i; // this is the instance variable

	public void setValue(int i) {
		this.i = i; // referes to the instance variable i of the current object
	}

	public void show() {
		System.out.println("Value of i: " + i);
	}
}

public class thisKeyword {
	public static void main(String[] args) {

		Example e1 = new Example();
		e1.setValue(10);
		e1.show();

		Example e2 = new Example();
		e2.setValue(100);
		e2.show();
	}
}
