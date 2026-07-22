package oops;

class School {
	
	interface Student {
		void details();
	}
	
}

class Demo implements School.Student {
	public void details() {
		System.out.println("Name : John Doe");
	}
}

interface Zoo{
	
	interface Cat {
		void sound();
	}
	
}

class Animals implements Zoo.Cat {
	public void sound() {
		System.out.println("Meow");
	}
}

public class NestedInterface {
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.details();
		
		Animals a = new Animals();
		a.sound();
	}
	
}
