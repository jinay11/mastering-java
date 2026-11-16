package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFileEx {
    public static void main(String[] args) {

        try{

            File file = new File("dummy.txt");

            if(file.createNewFile()){
                System.out.println("File Created : " + file.getName());
            }
            else{
                System.out.println("File already exists");
            }

        }catch(IOException e) {
            System.out.println("An error ocurred.");
        }

    }
}
