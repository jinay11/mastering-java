package basic;

public class AccessModifiers {

    //private modifiers
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Welcome " + name);
        return name;
    }

    //Default class
    String language;

    public static void main(String[] args) {
        System.out.println("Access Modifiers");

        AccessModifiers am = new AccessModifiers();
        am.setName("Jon");
        am.getName();

        am.language = "Java";
        System.out.println(am.language);

    }
}
