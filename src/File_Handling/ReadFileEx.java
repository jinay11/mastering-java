package File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {

        File obj = new File("C:\\Users\\jinay\\IdeaProjects\\mastring-java\\dummy.txt");
        Scanner reader = new Scanner(obj);

        while(reader.hasNext()) {
            String data = reader.nextLine();
            System.out.print(data);
        }
        reader.close();


    }
}
