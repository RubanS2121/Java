package com.example.javafiles;

import java.util.Scanner;

public class MainClass extends  EncapsulationDemo{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        EncapsulationDemo ed=new EncapsulationDemo();
        System.out.println("Enter first no.");
        ed.setNum1(sc.nextInt());
        System.out.println("Enter second no.");
        ed.setNum2(sc.nextInt());

        System.out.println("sum of " + ed.getNum1() + " and " + ed.getNum2() + " is " + ed.getNum3());

        //System.out.println(ed.Num1);
    }

}
