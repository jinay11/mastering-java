package string;

public class strings {
    public static void main(String[] args) {

        System.out.println("Strings ");

        String str = new String("String is immutable");

        System.out.println(str);

        //String is a sequence of character enclosed with double quotes.
        //String is immutable in java once we create it can not be changed
        //Two way of creating String
        // literal (Static memory)
        //using new keyword
        //String literals store in String literal pool


        String text = "Hello";

        text.concat("World");

        System.out.println(text);

        //.concat method does not modify original object, but it creates the new object

//        Difference Between == Operator and equals() Method in Java

        String s1 = "Hello";

        String s2 = "Hello";

        String s3 = new String("Hello");

        System.out.println(s1 == s2);

        System.out.println(s2 == s3);

        System.out.println(s1.equals(s2));

        System.out.println(s2.equals(s3));

    }

}