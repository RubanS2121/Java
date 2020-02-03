package com.example.december18;

public class ClassX extends CounterClass implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            increment();
        }
    }
}
