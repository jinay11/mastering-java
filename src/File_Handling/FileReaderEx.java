package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {

        FileReader reader =  new FileReader("C:\\Users\\jinay\\IdeaProjects\\mastring-java\\src\\File_Handling\\hello.txt");

        int data;

        while((data = reader.read()) != -1) {
            System.out.print((char) data);
        }

    }
}
