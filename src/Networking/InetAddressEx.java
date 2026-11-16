package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
    public static void main(String[] args) throws Exception {

        InetAddress ip = InetAddress.getLocalHost();

        System.out.println("Host Name : " + ip.getHostName());
        System.out.println("IP Address : " + ip.getHostAddress());

    }
}
