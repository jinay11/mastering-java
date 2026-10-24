package ExceptionHandling;

import java.io.IOException;

public class Throw_Throws {

    static void checkFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {

//        int marks = 21;
//
//        if(marks < 35) {
//            throw  new ArithmeticException("You Failed !!");
//        }else {
//            System.out.println("You passed");
//        }

        try {
            checkFile();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


        //throw give a actual exception
        //throws declare a method might be throw an exception

    }

}
