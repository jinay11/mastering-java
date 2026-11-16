package Networking;

import java.net.*;

public class URLEx {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.example.com:8080/products?id=10").toURI().toURL();

        System.out.println("Protocol: " + url.getProtocol());

        System.out.println("Host: " + url.getHost());

        System.out.println("Port: " + url.getPort());

        System.out.println("Path: " + url.getPath());

        System.out.println("Query: " + url.getQuery());

        System.out.println("File: " + url.getFile());

    }
}
