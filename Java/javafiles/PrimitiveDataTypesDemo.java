package com.example.javafiles;
import java.util.Scanner;

public class PrimitiveDataTypesDemo {


    public static void main(String args[]){
        /*
        //integer demo
        int num1=0;
        int num2=0;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the first no.");
        num1=in.nextInt();
        System.out.println("Enter the first no.");
        num2=in.nextInt();
        num1+=num2;

        System.out.println(num1 + " " + num2);
         */

        //double

       /* final double pi=3.1415;
        Scanner db=new Scanner(System.in);
        System.out.println("Enter the radius.");
        double radius=db.nextDouble();
        double area=radius*radius*pi;

        System.out.println("area of circle is: " + area);*/

       //Char demo

       /* Scanner cs=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input=cs.next().charAt(0);

        switch (input){

            case 'a':
                System.out.println(input+ " is the 1st letter of alphabets");
                break;
            case 'b':
                System.out.println(input+ " is the 2nd letter of alphabets");
                break;
            case 'c':
                System.out.println(input+ " is the 3rd letter of alphabets");
                break;
            case 'd':
                System.out.println(input+ " is the 4th letter of alphabets");
                break;
            case 'e':
                System.out.println(input+ " is the 5th letter of alphabets");
                break;
            case 'f':
                System.out.println(input+ " is the 6th letter of alphabets");
                break;
            case 'g':
                System.out.println(input+ " is the 7th letter of alphabets");
                break;
            case 'h':
                System.out.println(input+ " is the 8th letter of alphabets");
                break;
                default:
                    System.out.println("Invalid character");*/


       //Boolean demo

        boolean status;

        Scanner bl=new Scanner(System.in);

        System.out.println("Enter your status: ");
        status=bl.nextBoolean();

        System.out.println("the status is : " + status);




        }



    }

