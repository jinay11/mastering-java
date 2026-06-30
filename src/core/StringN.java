package core;

public class StringN {
    public static void main(String[] args) {
        String name = "Java";
        System.out.println("Original String : " + name);
        String result = name.concat(" Programming");
        System.out.println("new String " + result);

        //String method
        String str = "GeeksForGeeks";
        // System.out.println(str);
        System.out.println("Length "+str.length());
        System.out.println("UpperCase " + str.toUpperCase());
        System.out.println("subString " + str.substring(8));
        System.out.println("0th index charchter " + str.charAt(0));
        System.out.println("Index of For word is " + str.indexOf("For"));
        System.out.println(str.equals(str));
        System.out.println(str.equalsIgnoreCase(str));
        System.out.println("Lower case " + str.toLowerCase());
        System.out.println("trim remove white spaces " +str.trim());
        System.out.println("replace G to J " + str.replace("G", "J"));
        System.out.println("contains " + str.contains("For"));
    }
}
