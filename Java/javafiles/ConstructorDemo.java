package com.example.javafiles;

public class ConstructorDemo {

    public static void main(String args[]){

       // Ginger g2=new Ginger();//Default constructor from another package

        Ginger g1= Ginger.getGingerInstance();//private constructor called using factory method
        Ginger g2= Ginger.getGingerInstance();


        System.out.println(g1.hashCode());
        System.out.println(g2.hashCode());
    }


}