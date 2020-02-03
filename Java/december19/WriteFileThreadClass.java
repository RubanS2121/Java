package com.example.december19;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileThreadClass implements Runnable{

    static String filename="file.txt";
    @Override
    public void run() {
       try{ BufferedWriter bf= new BufferedWriter(new FileWriter(filename,true));
           for(int i=0; i<=10;i++){
               bf.write("Kapil :"+ i);
           }
           bf.flush();
           bf.close();


       } catch(Exception e) {
           System.out.println("Exception at Write thread class" + e);
       }
    }
}
