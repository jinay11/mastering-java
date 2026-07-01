package oops;

abstract class TV {
	abstract void tvOn();

	abstract void tvOff();

	public void display() {
		System.out.println("TV reach the reacharg limit ....");
	}

}

class TVRemote extends TV {
	public void tvOn() {
		System.out.println("TV is on");
	}

	public void tvOff() {
		System.out.println("TV is off");
	}
}

public class AbstractionEx {
	public static void main(String[] args) {
		TVRemote tv = new TVRemote();
		tv.tvOff();
		tv.tvOn();
		tv.display();
	}
}

