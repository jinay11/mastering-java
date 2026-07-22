package oops;

interface pay {
	void payMode(String mode);
}

class Mode implements pay {
	
	public void payMode(String mode) {
		System.out.println("payment done through " + mode);
	}
	
}

interface TvOn {
	void turnOn();
}

interface MovieOn{
	void playMovie();
}

interface TvOff {
	public void turnOff();
}

class Tv implements TvOn, MovieOn, TvOff {
	public void turnOn() {
		System.out.println("TV is turned on");
	}
	
	public void playMovie() {
		System.out.println("Movie is playing");
	}
	
	public void turnOff() {
		System.out.println("Tv power is off");
	}
}

public class Interface {
	
	public static void main(String[] args) {
		
		Mode m1 = new Mode();
		m1.payMode("UPI");
		
		//multiple inheritance
		Tv tv = new Tv();
		tv.turnOn();
		tv.playMovie();
		tv.turnOff();
	}
	
}
