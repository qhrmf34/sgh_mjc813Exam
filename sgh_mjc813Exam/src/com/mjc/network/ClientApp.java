package com.mjc.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class ClientApp {
    private Socket sck = null;

    public ClientApp() {
        this.sck = new Socket();    // 클라이언트소켓 생성
    }
    public void init(String ipAddr, int port) throws IOException {
        SocketAddress sa = new InetSocketAddress(ipAddr, port);
        this.sck.connect(sa);
        // Ip 주소와 포트로 접속한다.
    }
    public void send(String str) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(this.sck.getOutputStream())
        );
        while(true) {
            String line = sc.nextLine();

            writer.write(line+"\n");   // 통신소켓에 데이터를 전송한다.
            writer.flush();
            if(line.equals("quit")){
                line="exit!@#$app";
            }
            if(line.equals("exit!@#$app")) break;


        }
        writer.close();

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

