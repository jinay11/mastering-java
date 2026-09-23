package method;

public class VarArgs {

    public void display(int... numbers) {
//        System.out.println(numbers.length);
        for(int i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Variable arguments : ");

        VarArgs var = new VarArgs();
        var.display(10);
        var.display(20,30);
        var.display(40,50,60);
        var.display(70,80,90,100);

    }
}
