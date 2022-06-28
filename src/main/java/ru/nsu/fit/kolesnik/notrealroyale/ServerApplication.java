package ru.nsu.fit.kolesnik.notrealroyale;

import ru.nsu.fit.kolesnik.notrealroyale.networking.Server;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerApplication {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12000);
            Server server = new Server(serverSocket);
            server.listenForServerRequest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
