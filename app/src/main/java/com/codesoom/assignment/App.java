package com.codesoom.assignment;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

            InetSocketAddress serverAddress = new InetSocketAddress(8000);
            HttpServer httpServer = HttpServer.create(serverAddress,0);


    }
}
