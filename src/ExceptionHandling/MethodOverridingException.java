package ExceptionHandling;

import java.io.IOException;

class Parent {
    void show() {
        System.out.println("This is the parent class");
    }



}

class Child {
    void show() {
        try {
            int sum = 10 / 0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

// rules
//if parent dont declare any exception so child class can not declare a Compile time Exception

//2 if parent can declare a exception runtime
//(i) if parent have a exception its not compulsory for child throw exception
//(ii) if parent throw exception and child also throw exception we can not throw a compile exception

public class MethodOverridingException {
    public static void main(String[] args) {

        Child c = new Child();
        c.show();

    }
}
