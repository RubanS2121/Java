package com.example.december18;

public class ClassD implements Runnable {


    @Override
    public void run() {

        for(int i=0; i<=2; i++){
            System.out.println("Class D running "+ i);
            try {Thread.sleep(1000);} catch(Exception e){
                System.out.println("Exception at D: "+ e);
            }
        }
    }
}
