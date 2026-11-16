package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEx {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("C:\\Users\\jinay\\IdeaProjects\\mastring-java\\src\\File_Handling\\hello.txt",true);

        writer.write("/n new data");
        writer.write("Hello User");
        writer.write("Welcome to the hello world");

        writer.close();

        System.out.println("Data written successfully!!");

    }
}
