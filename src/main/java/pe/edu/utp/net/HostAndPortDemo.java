package pe.edu.utp.net;

import com.google.common.net.HostAndPort;

public class HostAndPortDemo {

    public static void main(String[] args) {

        HostAndPort host = HostAndPort.fromString("localhost:8080");
        System.out.println("host.getHost() = " + host.getHost());
        System.out.println("host.getPort() = " + host.getPort());

    }

}
