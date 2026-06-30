package core;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Car {
    String model;
}

public class AcessModifiers {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Alice");
        System.out.println(p.getName());

        Car c = new Car();
        c.model="Tesla101";
        System.out.println(c.model);

    }
}
