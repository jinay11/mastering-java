package oops;

abstract class RBI {
	abstract void accNumber(String number);

	abstract void ifcCode(String code);

	abstract void panNumber(String pan);

	void name(String name) {
		System.out.println("Account holder name : " + name);
	}

	void number(int number) {
		System.out.println("contact number is : " + number);
	}
}

class Bank extends RBI {
	public void accNumber(String number) {
		System.out.println("Your account number is : " + number);
	}

	public void ifcCode(String code) {
		System.out.println("Your IFC code is : " + code);
	}

	public void panNumber(String pan) {
		System.out.println("Your pan number is : " + pan);
	}
}

public class Abstract {
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.name("Jon");
		bank1.number(1234567893);
		bank1.accNumber("123456789012");
		bank1.ifcCode("ABCD0123456");
		bank1.panNumber("ABCDE1234F");

		System.out.println("-------------------------------------");

		Bank bank2 = new Bank();
		bank2.name("Priya");
		bank2.number(675894235);
		bank2.accNumber("657812458775");
		bank2.ifcCode("RQFGS784621");
		bank2.panNumber("WTYDB8605F");

		System.out.println("-------------------------------------");

		Bank bank3 = new Bank();
		bank3.name("Yash");
		bank3.number(1413978517);
		bank3.accNumber("129375642499");
		bank3.ifcCode("EFGH0456789");
		bank3.panNumber("LMNOP4321Q");
	}
}