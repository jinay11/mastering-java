package core;

class Operators{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        //addition
        int add = a + b;
        
        //substraction
        int sub = a - b;

        //multiplication
        int mul = a * b;

        //division
        int div = a / b;

        //modulus
        int mod = a % b;

        System.out.println("Addition : " +add);
        System.out.println("Substration : " + sub);
        System.out.println("multiplication : " + mul);
        System.out.println("division : " + div);
        System.out.println("modulus : " + mod);

        //Unary operators
        int c = 5;

        System.out.println("Post intcrement : " +  (c++));
        System.out.println("Pre increment : " + (++c));

        int decrement = 10;
        System.out.println("Post decrement : " + (decrement--));
        System.out.println("Pre increment : " + (--decrement));


        //Assignment operator -> assigning value to a variable 
        int assign = 10;

        assign += 5;
        System.out.println("Assignment operator : " + assign);

        assign -= 5;
        System.out.println("Assignment operator : " + assign);

        assign *=2;
        System.out.println("Assignment operator : " + assign);

        assign /=2;
        System.out.println(assign);


        //Relational operators check a relation between two operands greater than, less than, equal to or not and returns a boolean value true or false

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);


        //Logical operators -> used to perform a logical operations like AND, OR, NOT and returns a boolean value true or false

        System.out.println("Logical operaors");

        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        //Ternary operators -> it is a shorthand for if-else statement 
        int age = 15;

        String result = (age >=18) ? "Adult" : "Minor";
        System.out.println(result);

        String result2 = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(result2);


        //instance of operator -> used to check object is an instance of class or not 
        String str = "Hello";
        System.out.println(str instanceof String);
        Object obj = 10;
        System.out.println(obj instanceof  Object);
        System.out.println(obj instanceof String);

    }
}