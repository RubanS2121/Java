package com.example.december12;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class TypeCastingDemoClass {

    public static void main(String[] args){

        int i= 65;
        char ch=(char) i;
        System.out.println("ASCII of " + i + " is " + ch);

        short s= (short) ch;
        System.out.println("short of " + ch + " is " + s);

        char sh='k';

        String str="4.7";
        int j=0;
        try
        {
             j= sh;
        int n= Integer.parseInt(str);
        }
        catch (NumberFormatException N){

            System.out.println("Exception: " +  N.getMessage() + "!!!!!!!!!!!!!!!!!!");
        }
        finally {
            System.out.println(j);
        }

        }
    }

