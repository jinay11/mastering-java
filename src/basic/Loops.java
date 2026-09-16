package basic;

public class Loops {
    public static void main(String[] args) {

        for (int i=0; i < 5; i++) {
            System.out.println("This is for loop");
        }

        String names[] = {"Sweta", "Gudly", "Amiya"};

        for(String name : names){
            System.out.println("Name : " + name);
        }

        int j= 1;
        while (j <= 3) {
            System.out.println("While loop" + j);
            j++;
        }

        int k = 1;
        do {
            System.out.println("do while loop " + k);
            k++;
        }while(k <= 2);

    }
}
