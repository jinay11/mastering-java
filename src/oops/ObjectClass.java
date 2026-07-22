package oops;

public class ObjectClass {
	String name = "Jon";
	int age = 21;
	
	@Override
	public String toString() {
		return "{ Name : " + name + ", Age : " + age +"}";			
	}
	
	@Override
	public int hashCode() {
		return age * 10;
	}
	
	public static void main(String[] args) {
		
		ObjectClass obj = new ObjectClass();
		
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
	}
	
}
