package com.mjc.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ServerScannerThread extends Thread {
    private Scanner scanner = null;
    private BufferedWriter bw = null;
    public ServerScannerThread(Scanner scanner, BufferedWriter bw) {
        this.scanner = scanner;
        this.bw = bw;
    }
    @Override
    public void run() {
        while(true) {
            try {
                String str = scanner.nextLine();
                if("quit".equals(str)) {
                    this.send("exit!@#$app");
                    this.bw.close();
                    break;
                }
                this.send(str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable e) {
                System.out.println("client disconnted");
            }
        }
    }
    private void send(String str) throws IOException {
        this.bw.write(str);
        this.bw.newLine();  // 이 문장이 없으면 소켓전송을 제대로 못하는 현상이 발생함.
        this.bw.flush();     // 전송 flush 한다.
    }
}