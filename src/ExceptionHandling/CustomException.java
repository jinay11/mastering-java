package ExceptionHandling;

class StudentFailedException extends Exception {
    StudentFailedException(String message){
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {

        int marks = 35;

       try {

           if(marks < 35) {
               throw  new StudentFailedException("Student falied");
           }
           else {
               System.out.println("Pass");
           }
       }catch (StudentFailedException e){
           System.out.println(e.getMessage());
       }

    }

}
