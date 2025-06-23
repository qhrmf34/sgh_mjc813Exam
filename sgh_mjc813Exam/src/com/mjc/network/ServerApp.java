package com.mjc.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ServerApp implements Broadcast{
    private ServerSocket ss = null;
    private Scanner sc = new Scanner(System.in);
    private LinkedList<Socket> sockets = new LinkedList<>();
    private ServerAcceptThread acceptThread;

    public ServerApp(int port) throws IOException {
        this.ss = new ServerSocket(port);
    }


    public void broadcastMessage(String message) {
        for (Socket sck : sockets) {
            if (!sck.isClosed() && sck.isConnected()) {
                try {
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(sck.getOutputStream()));
                    writer.write(message);
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    System.err.printf("에러 : [%s] : [%s] : [%s] \n",sck.getInetAddress().toString(),sck.getPort() ,e.getMessage());

                }
            } else {
                synchronized(sockets){
                    Iterator<Socket> iterator=sockets.iterator();
                    sck=iterator.next();
                    iterator.remove();

                }
                System.out.printf("[%s] : [%s] 소켓이 리스트에서 지워짐",sck.getInetAddress(),sck.getPort());
            }
        }
    }


    public void init() throws IOException {

        acceptThread=new ServerAcceptThread(sockets,ss,this);
        acceptThread.start();

        Thread servermessage=new ServerMessageThread(this,ss);
        servermessage.start();
    }

    public void closeAllConnections() {
        for (Socket sck : sockets) {
            try {
                if (!sck.isClosed()) {
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(sck.getOutputStream()));
                    writer.write("exit!@#$app");
                    writer.newLine();
                    writer.flush();
                    sck.close();
                }
            } catch (IOException e) {
                System.err.println("서버 종료 " + e.getMessage());
            }
        }
        if(sockets!=null&&!sockets.isEmpty()) {
            sockets.clear();
        }
        if(acceptThread!=null) {
            acceptThread.shutdown();
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println("Server start");
        ServerApp sa = new ServerApp(44567);
        sa.init();
    }
}