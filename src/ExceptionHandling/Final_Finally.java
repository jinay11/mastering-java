package ExceptionHandling;

public class Final_Finally {

    public static void main(String[] args) {

        final int age = 22;

        System.out.println("age is : " + age);

//        age = 23; final can not reassined


        try {

            int result = 10 /5;
            System.out.println("the result is : " + result);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        } finally {
            System.out.println("finally clean up the task");
        }
    }
}
