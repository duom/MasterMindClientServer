package com.company;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws IOException {

        String ip;
        Scanner scanner = new Scanner(System.in);

        System.out.println("A que IP del Servidor quieres conectarte? ");
        ip = scanner.nextLine();

        Client clientUDP = new Client(ip,5556);
        clientUDP.setNom("Albert");
        clientUDP.runClient();

//

    }
}
