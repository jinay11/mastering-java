package File_Handling;

import java.io.FileWriter;

public class FileWriterEx {
    public static void main(String[] args) {

        try{
            FileWriter writer = new FileWriter("C:\\Users\\jinay\\IdeaProjects\\mastring-java\\dummy.txt");
            writer.write("Files in java are seriously good!!");
            System.out.println("Successfully Writtern.");
        }catch(Exception e){
            System.out.println("An error ocuured");
        }

    }
}
