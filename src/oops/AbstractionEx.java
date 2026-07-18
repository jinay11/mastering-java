package oops;

abstract class TV{
	abstract void tvOn();
	abstract void tvOff();
	
	public void sport() {
		System.out.println("You are watching sports channel");
	}
	
}

class TvRemote extends TV {
	
	@Override
	void tvOn() {
		System.out.println("TV is turned ON");
	}
	
	@Override
	void tvOff() {
		System.out.println("TV is turned OFF");
	}
}

public class AbstractionEx {
	public static void main(String[] args) {
		TvRemote remote = new TvRemote();
		remote.tvOn();
		remote.sport();
		remote.tvOff();
	}
}

