package Interface;

interface special {
    //no methods and no fields it is a marker interface mark a class
}

class Important implements  special {
    public  void message() {
        System.out.println("Marker interface is an empty used to mark a class");
    }
}

public class Marker_interface {

    public static void main(String[] args) {
        Important imp = new Important();
        imp.message();
    }

}
