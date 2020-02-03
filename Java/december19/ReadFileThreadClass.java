package com.example.december19;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileThreadClass implements Runnable {

    static String fileName="file.txt";
    @Override
    public void run() {
        String temp;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((temp=br.readLine())!=null){
                String[] show= temp.split("\\s");
                for (String s:
                     show) {
                    System.out.println(s);
                }
            }

        }
        catch(Exception e){
            System.out.println("Exception at read thread: "+ e);
        }
    }
}
