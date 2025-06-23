package com.mjc.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerAcceptThread extends Thread {
    private LinkedList<Socket> sockets=null;
    private ServerSocket ss=null;
    private Broadcast broadcast=null;
    private ExecutorService executor= Executors.newFixedThreadPool(100);
    public ServerAcceptThread(LinkedList<Socket> sockets, ServerSocket ss, Broadcast broadcast) {
        this.sockets=sockets;
        this.ss=ss;
        this.broadcast=broadcast;
    }


    public void run(){
        while (true) {
            try {
                Socket sck = this.ss.accept();
                synchronized(sockets) {
                    sockets.add(sck);
                }
                executor.submit(new ServerReadAndBroadcast(sck,sockets,broadcast));
            } catch (IOException e) {
                if (this.ss.isClosed()) {
                    break;
                }
                System.err.println("클라이언트 연결 에러 : " + e.getMessage());
            }
        }}

    public void shutdown() {
        executor.shutdown();
    }

}



