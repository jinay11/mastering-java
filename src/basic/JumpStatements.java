package basic;

public class JumpStatements {

    static void checkNumber(int number) {
        if(number < 0) {
            return;
        }
        System.out.println("Positive number : " + number);
    }

    public static void main(String[] args) {
        for(int i=1; i<=4 ; i++){
            if(i == 3){
                break;
            }
            System.out.println("Break statement : " + i);
        }

        for(int j =1; j<= 5; j++){
            if(j == 3) {
                continue;
            }
            System.out.println("continue statement : " + j);
        }

        checkNumber(-12);

    }
}
