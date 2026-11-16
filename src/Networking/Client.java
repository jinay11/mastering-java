package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost",5000);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message = in.readLine();

        System.out.println("Server says : " + message);

        socket.close();

    }
}
