package Java8;

import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {

        Supplier<String> s = () -> "Hello world";

        System.out.println(s.get());
    }
}
