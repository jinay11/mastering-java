package oops;

public class Person {
	String name;
	int age;
	void display() {
		System.out.println("Welcome " + name + " You are a " + age + " years old");
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		Person p = new Person();
		p.name = "joe";
		p.age = 21;
		
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p.getClass());
		
	}
	
}