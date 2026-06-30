package core;

public class StringBuilderNew {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("GeeksForGeeks");
        System.out.println("Intial : " + sb);
        
        sb.append(" is awesome");
        System.out.println("After Append : " + sb);

        sb.insert(13,  " java");
        System.out.println("After insert : " + sb);

        sb.replace(0, 5, "Welcome to : ");
        System.out.println("After Replace : " + sb);

        sb.delete(8, 14);
        System.out.println("After delete : " + sb);

        sb.reverse();
        System.out.println("After reverse : " + sb);

        System.out.println("Capacity : " + sb.capacity());
        System.out.println("Length : " + sb.length());

        char c = sb.charAt(5);
        System.out.println("Charcter at index 5 : " +c);

        String sub = sb.substring(5,10);
        System.out.println("SubString (5-10) : " + sub);

        sb.reverse();
        System.out.println("Index of Geeks : " + sb.indexOf("Geeks"));

        sb.deleteCharAt(5);
        System.out.println("After the delete the char at 5 : " + sb);

        String result = sb.toString();
        System.out.println("Final Output : " + result);

    }
}
