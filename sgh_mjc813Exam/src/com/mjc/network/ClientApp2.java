package com.mjc.network;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedList;
import java.util.Scanner;

public class ClientApp2 {
    private Socket sck = null;
    private BufferedWriter bw = null;
    private LinkedList<Socket> socketlist = new LinkedList<>();
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
    public void send(String str) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(this.sck.getOutputStream())
        );
        System.out.println("이름을 정하시오.");
        String name = sc.nextLine();
        while(true) {

            String line = sc.nextLine();
            if(line.equals("quit")||line.equals("exit!@#$app")){
                writer.write(name+": exit!@#$app\n");
                writer.flush();
                break;
            }
            writer.write(name+": "+line+"\n");   // 통신소켓에 데이터를 전송한다.
            writer.flush();

        }
        writer.close();

    }
    public void broadcast(String str) throws IOException {

    }
    public static void main(String[] args) {
        System.out.println("Client start");
        try {
            ClientApp ca = new ClientApp();
            ca.init("127.0.0.1", 44567);
            ca.send("Aa");

        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}

