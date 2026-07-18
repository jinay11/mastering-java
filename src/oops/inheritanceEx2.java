package oops;

class Employeee {
	
	public void login() {
		System.out.println("Employee logged in");
	}
	public void logout() {
		System.out.println("Employee logged out");
	}
	
}

class Devloper extends Employeee {
	
	public void writeCode() {
		System.out.println("Developer is writing code ");
	}
	
}

public class inheritanceEx2 {
	public static void main(String[] args) {
		Devloper dev = new Devloper();
		dev.login();
		dev.writeCode();
		dev.logout();
	}
}
