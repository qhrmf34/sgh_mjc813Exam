package com.mjc.network;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class ClientApp2 {
    private Socket sck = null;
    private BufferedWriter bw = null;

    public ClientApp2() {
        this.sck = new Socket();    // 클라이언트소켓 생성
    }
    public void init(String ipAddr, int port) throws IOException {
        SocketAddress sa = new InetSocketAddress(ipAddr, port);
        this.sck.connect(sa);
        this.bw = new BufferedWriter(
                new OutputStreamWriter(this.sck.getOutputStream())
        );
        BufferedReader br = new BufferedReader(
                new InputStreamReader(this.sck.getInputStream())
        );
        Thread readSocketThread = new Thread(new ClientReadSocketThread(br));
        readSocketThread.start();
        // Ip 주소와 포트로 접속한다.
        // Ip 주소와 포트로 접속한다.
    }
    public void send() throws IOException {
        Thread send=new ClientWriteThread(this.sck,this.bw);
        send.start();
    }
    public static void main(String[] args) {
        System.out.println("Client start");
        try {
            ClientApp2 ca = new ClientApp2();
            ca.init("127.0.0.1", 44567);
            ca.send();

        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}

