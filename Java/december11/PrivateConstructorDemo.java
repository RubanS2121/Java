package com.example.december11;

public class PrivateConstructorDemo {

    private PrivateConstructorDemo(){

        System.out.println("Hello");

    }

    public static void main(String[] args){

        PrivateConstructorDemo pcd =new PrivateConstructorDemo();
        PrivateConstructorDemo pcd2= new PrivateConstructorDemo();
    }
}
