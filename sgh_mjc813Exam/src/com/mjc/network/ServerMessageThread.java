package com.mjc.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class ServerMessageThread extends Thread {
    private Scanner scanner;
    private Broadcast broadcast=null;
    private ServerSocket serverSocket=null;
    public ServerMessageThread(Broadcast broadcast, ServerSocket serverSocket) {
        this.broadcast = broadcast;
        this.serverSocket = serverSocket;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
            try {
                while (true) {
                    String msg=scanner.nextLine();
                    if ("exit!@#$app".equals(msg)) {
                        System.out.println("서버 셧다운");
                        broadcast.broadcastMessage("서버가 다운됐습니다. 연결을 해제합니다.");
                        broadcast.closeAllConnections();
                        serverSocket.close();

                        break;
                    }
                    broadcast.broadcastMessage("서버: " + msg);
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
    }

}

