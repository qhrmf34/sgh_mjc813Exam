package com.mjc.network;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerApp {
    private ServerSocket ss = null;
    private Scanner sc = null;
    private ExecutorService es = Executors.newFixedThreadPool(10);

    public ServerApp(int port) throws IOException {
        // this.ss = new ServerSocket(port);   // 포트번호로 서버소켓 생성
        this.ss = new ServerSocket();
        this.ss.bind(new InetSocketAddress(44567)); // 바인드 명령으로 접속받아들일 IP주소대역과 포트번호로 클라이언트 접속을 대기할 수 있다.
    }
    public void startThread(Socket sck) {
        es.execute(()->{
            try {
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(sck.getInputStream())
                );
                String str;
                while((str = reader.readLine()) != null) {
                    System.out.println(str);
                }
                reader.close(); // 읽기버퍼닫기
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    public void init() throws IOException {
        while(true){
            try {
                Socket sck = this.ss.accept();  // 클라이언트접속 기다림, 블로킹상태
                System.out.println(sck.toString()); // 접속되면 이 문장 실행

                startThread(sck);

            }
            catch (IOException e) {
                System.err.println(e.getMessage());
                throw e;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Server start");
        ServerApp sa = new ServerApp(44567);
        sa.init();
    }
}