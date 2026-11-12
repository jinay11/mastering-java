package Java8;

interface Calculator {

    int calculator(int a, int b);

}

public class LamdaExpression {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator multi = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("Addition : " + add.calculator(10, 2));
        System.out.println("multiplication : " + multi.calculator(10, 2));
        System.out.println("Division : " + div.calculator(10, 2));

    }
}
