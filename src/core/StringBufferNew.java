package core;

public class StringBufferNew {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("world");
        sb.insert(1, "Java");
        sb.replace(1, 5, "jinay");
        sb.delete(1, 6);
        sb.reverse();
        System.out.println(sb);
        System.out.println("The length of String is : " + sb.length());
    }
}
