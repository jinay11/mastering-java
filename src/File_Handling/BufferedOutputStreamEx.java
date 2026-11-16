package File_Handling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\jinay\\IdeaProjects\\mastring-java\\dummy.txt",true);

        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String data = "Hello java Devloper!!";

        bos.write(data.getBytes());

        bos.close();

        System.out.println("Data written successfully :) ");

    }
}
