package com.mjc.mjc813.cal;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("file.txt")){
            fw.write("Java");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
