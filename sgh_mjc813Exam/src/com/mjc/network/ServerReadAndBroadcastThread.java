package com.mjc.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;

public class ServerReadAndBroadcastThread extends Thread {
    private Socket clientSocket=null;
    private LinkedList<Socket> sockets=null;
    private Broadcast broadcast=null;
    public ServerReadAndBroadcastThread(Socket clientSocket, LinkedList<Socket> sockets, Broadcast broadcast) {
        this.clientSocket = clientSocket;
        this.sockets = sockets;
        this.broadcast = broadcast;
    }

    public void run(){
        {
            String clientAddress = clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort();
            System.out.println("Client connected: " + clientAddress);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                String str;
                while ((str = reader.readLine()) != null) {
                    System.out.println("[" + clientAddress + "] " + str);
                    if (str.equals("exit!@#$app")) {
                        System.out.println("Client " + clientAddress);
                        break;
                    }
                    broadcast.broadcastMessage("[" + clientAddress + "] " + str);
                }
            } catch (IOException e) {
                System.err.printf("Client : [%s] : %s\n",clientAddress,e.getMessage());
            } finally {
                try {
                    synchronized (sockets) {
                        sockets.remove(clientSocket);
                    }
                    clientSocket.close();
                    System.out.println("Client " + clientAddress + " removed. " + sockets.size());
                    broadcast.broadcastMessage("Server: Client " + clientAddress);
                } catch (IOException e) {
                    System.err.println("Handler 에러 " + clientAddress + ": " + e.getMessage());
                }
            }
        }

    }
}
