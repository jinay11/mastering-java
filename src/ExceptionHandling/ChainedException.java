package ExceptionHandling;

import java.io.IOException;

public class ChainedException {

    static void readfile() throws Exception {
        try {
            throw new IOException("File not found");
        }catch (Exception e) {
            throw new Exception("could not load settings", e);
        }
    }

    public static void main(String[] args) {
        try {
            readfile();
        }catch (Exception e) {
            System.out.println("Problem : " + e.getMessage());
            System.out.println("Real Cause : " +e.getCause());
        }
    }
}
