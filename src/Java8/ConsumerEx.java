package Java8;

import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {

        Consumer<Integer> c = num -> {
            System.out.println(num);
        };

        c.accept(10);
        c.accept(20);

    }
}
