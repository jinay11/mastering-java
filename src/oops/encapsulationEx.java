package oops;

class Employee{
	public String name;
	private double salary;
	public int age;
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
}

public class encapsulationEx {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "john doe";
		emp.age = 24;
		emp.setSalary(50000);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Age: " + emp.age);
		System.out.println("Employee Salary: " + emp.getSalary());
	}
}
