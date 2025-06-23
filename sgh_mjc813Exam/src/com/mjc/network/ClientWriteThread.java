package com.mjc.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientWriteThread extends Thread{
    private Socket sck=null;
    private BufferedWriter bw = null;
    public ClientWriteThread(Socket sck, BufferedWriter bw){
        this.sck = sck;
        this.bw = bw;
    }

    public void run(){
        try {
            send();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void send() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 정하시오.");
        String name = sc.nextLine();
        while(true) {

            String line = sc.nextLine();
            if(line.equals("quit")||line.equals("exit!@#$app")){
                bw.write(name+": exit!@#$app\n");
                bw.flush();
                break;
            }
            bw.write(name+": "+line+"\n");   // 통신소켓에 데이터를 전송한다.
            bw.flush();

        }
        bw.close();

    }

}
