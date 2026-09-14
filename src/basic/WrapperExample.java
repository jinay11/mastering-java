package basic;

public class WrapperExample {

    public static void main(String[] args) {
//        int a = 10;
//        Integer b = 10;
//        System.out.println(a);
//        System.out.println(b);

        System.out.println("autoboxing convert a primitive into Wrapper object");
        int a = 10;
        Integer b = a;
        System.out.println(b);

        System.out.println("Unboxing conver a Wrapper object into primitive");
        Integer i = 10;
        int j = i;
        System.out.println(j);

    }

}
