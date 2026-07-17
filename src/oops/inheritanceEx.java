package oops;

//single level 
//class A {
//	public void display() {
//		System.out.println("Class A");
//	}
//}
//
//class B extends A {
//	public void displayB() {
//		System.out.println("Class B");
//	}
//}

//multilevel inheritance
//class A {
//	A() {
//		System.out.println("Class A Constructor");
//	}
//}
//
//class B extends A {
//	B() {
//		System.out.println("Class B Constructor");
//	}
//}
//
//class C extends B {
//	C() {
//		System.out.println("Class C Constructor");
//	}
//}


//Hierarchical inheritance

class parnt{
	parnt() {
		System.out.println("This is the parent class");
	}
}

class child1 extends parnt{
	child1() {
		System.out.println("This is the child1 class");
	}
}

class superChild extends child1{
	superChild() {
		System.out.println("This is the super child class");
	}
}

public class inheritanceEx {
	public static void main(String[] args) {
		
		//single level inheritance
//		B b = new B();
//		b.display();
//		b.displayB();
		
//		//multilevel inheritance
//		C c = new C();

		//Hierarchical inheritance
		
//		parnt p = new parnt();
		
//		child1 c1 = new child1();
		
		superChild sc = new superChild();
		
	}
}
