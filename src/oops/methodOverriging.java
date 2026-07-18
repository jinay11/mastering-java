package oops;

class Bank1 {

	public void rateOfInterest() {
		System.out.println("Generally Rate of Interest is 10%");
	}

}

class SBI extends Bank1 {

	@Override
	public void rateOfInterest() {
		System.out.println("SBI Rate of Interest is 7%");
	}

}

class HDFC extends Bank1 {

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC Rate of Interest is 8%");
	}
}

// method overriding means same method name and same parameters with different class

public class methodOverriging {
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.rateOfInterest();

		SBI s = new SBI();
		s.rateOfInterest();

		HDFC h = new HDFC();
		h.rateOfInterest();
	}
}
