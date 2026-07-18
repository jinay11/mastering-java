package oops;

abstract class BOB {
	abstract void accNumber();
	
	public String holderName(String name) {
		System.out.println("Account holder name is: " + name);
		return name;
	}
	
	public String bankName(String name) {
		System.out.println("Welcome to the " + name);
		return name;
	}
	
	abstract void IFSCCode();
	
	public double balance(double amount) {
		System.out.println("Your account balance is: " + amount);
		return amount;
	}
}

class bank1 extends BOB {
	
	@Override
	void accNumber() {
		System.out.println("Account number is: 1234567890");
	}
	@Override
	void IFSCCode() {
		System.out.println("IFSC code is: SBIN0001234");
	}
	
}

public class Abstract {
	public static void main(String[] args) {
		bank1 sbi = new bank1();
		sbi.bankName("State Bank of India");
		sbi.holderName("John Doe");
		sbi.accNumber();
		sbi.IFSCCode();
		sbi.balance(5000.00);
	}
}