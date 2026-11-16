package File_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderEx {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name");

        String name = br.readLine();

        System.out.println("Your name is : " + name);

    }
}
