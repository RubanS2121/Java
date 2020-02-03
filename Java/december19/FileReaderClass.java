package com.example.december19;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReaderClass {


    public static void main(String [] args) throws FileNotFoundException,InterruptedException {

       /* String fileName="/Users/user/Documents/AndroidStudioProjects/JavaFiles/src/main/java/com/example/december19/format.csv";
        File f= new File(fileName);
        String str="";
        try{

            BufferedReader bf= new BufferedReader(new FileReader(fileName));
            bf.readLine();
            while ((str=bf.readLine())!=null){
                String[] values= str.split(",");

                System.out.println(values[10]);
            }



           *//* Scanner S= new Scanner(f);
            S.next();
            while(S.hasNextLine()){
                String temp= S.nextLine();
                String[] values= temp.split(",");
                System.out.println(values[8]);
            }*//*
        }
        catch (Exception e){
            System.out.println(e);
        }*/


Thread t1= new Thread(new WriteFileThreadClass());
Thread t2= new Thread (new ReadFileThreadClass());

t1.start();
try{
    Thread.sleep(2000);
}
catch(Exception e){
    System.out.println("Exception at main method: " + e);
}
t2.start();;


t1.join();
t2.join();

        System.out.println("Operation successful");





    }
}
