package com.company;

import java.io.IOException;
import java.net.SocketException;

public class MainServer {
public static void main(String[] args) throws SocketException, IOException {
        Server sAdivina = new Server(5556, 100);

        try {
        sAdivina.runServer();
        } catch (IOException e) {
        e.printStackTrace();
        }
        System.out.println("Fi Servidor");


}
}

