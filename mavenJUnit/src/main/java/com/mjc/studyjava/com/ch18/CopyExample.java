package com.mjc.studyjava.com.ch18;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        InputStream is=new FileInputStream("C:/Temp/test.jpg");
        OutputStream os=new FileOutputStream("C:/Temp/test2.jpg");
        byte[] data=new byte[1024];
        while(true){
            int num=is.read(data);
            if(num==-1)break;
            os.write(data,0,num);
        }

        os.flush();
        os.close();
        is.close();
        System.out.println("복사 완료");
    }
}
