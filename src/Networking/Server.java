package Networking;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(5000);

        System.out.println("Server is waiting...");

        Socket socket = server.accept();

        System.out.println("Client connected!");

        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        out.println("Hello Client !");

    }
}
