package com.example.december18;

public class ClassB extends Thread{

    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("Class B running "+i);
            try{Thread.sleep(1000);} catch(Exception e){
                System.out.println("Exception at B: "+ e);
            }
        }
    }
}
