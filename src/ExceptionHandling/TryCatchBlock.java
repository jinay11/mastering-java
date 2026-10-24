package ExceptionHandling;

public class TryCatchBlock {

    public static void main(String[] args) {

        try {
            int result = 10/0;
            System.out.println(result);

        } catch(ArithmeticException e) {
//            System.out.println("can not divide by zero");
            System.out.println("Error cause " + e.getMessage());
        }

        System.out.println("Programm continue");

    }
}
