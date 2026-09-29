package string;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("String Methods");

        String text = "BackendInJava";

        System.out.println("Length : " + text.length());
        System.out.println("UpperCase : " + text.toUpperCase());
        System.out.println("SubString : " + text.substring(0,7));
        System.out.println("CharAt 0 is  : " + text.charAt(0));
        System.out.println("append String : " + text.concat("!!"));
        System.out.println("Index of Java is : " + text.indexOf("Java"));
        System.out.println("Index of J found at " + text.indexOf("J",1));
        System.out.println("Found form last a " + text.lastIndexOf("a"));
        System.out.println("ignore case " + text.equalsIgnoreCase("backendinjava"));

        String TextTrim = "     Hello Trim        ";
        System.out.println(TextTrim.trim());

        System.out.println("containes Java : " + text.contains("Java"));

        char[] chars = text.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("start with Back word " + text.startsWith("Back"));

    }
}
