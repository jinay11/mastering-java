package core;

public class Loops {

    // loops are used to execute a block of code repeadly until condition is met

    public static void main(String[] args) {

        // 1. forloop -> used to when number of iteration is known.
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " For Loop in java");
        }

        // 2. while loop (used to check a first condition)
        int i = 1;
        while (i <= 3) {
            System.out.println(i + " while loop");
            i++;
        }

        // 3. do-while used when you need to run at leat one time before checking the
        // condition
        int j = 1;
        do {
            System.out.println(j + " : do while loop");
            j++;
        } while (j <= 3);

        // 4. for-each used when you iterate through array and collections
        String names[] = { "user 1", "user 2", "user 3", "user 4" };
        for (String n : names) {
            System.out.println(n);
        }
    }

}