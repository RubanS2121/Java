package com.example.december18;

public class ThreadDemo extends CounterClass{

    public static void main (String[] args) throws InterruptedException{
        ClassA A= new ClassA();
        ClassB B= new ClassB();

        A.setName("A-Thread");
        B.setName("B-Thread");

        A.start();
        try {Thread.sleep(500);} catch (Exception e){
            System.out.println("Exception in main: "+ e);
        }
        B.start();

        A.join();
        B.join();



        System.out.println(A.isAlive());


        ClassC C= new ClassC();
        ClassD D= new ClassD();

        Thread t1= new Thread(C,"C-Thread");
        Thread t2= new Thread(D,"D-Thread");

        t1.start();
        try { Thread.sleep(100);} catch (Exception e){
            System.out.println("Exception in main: "+ e);
        }
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(A.getName());
        System.out.println(B.getName());

        Thread t3=new Thread(new ClassX());
        Thread t4=new Thread(new ClassY());

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(counter);

    }
}
