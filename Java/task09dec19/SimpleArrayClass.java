package com.example.task09dec19;

import java.util.Scanner;

public class SimpleArrayClass {

    public int[] getArrayDetails() {




        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the no. of elements");
         int len=0;
         len=sn.nextInt();
        int[] arr = new int[len];


        System.out.println("Enter the elements of your array:");

        for (int i = 0; i < len; i++) {

            arr[i]=sn.nextInt();

        }

        return arr;
    }

    public void printArray(int[] arr){

        System.out.println("Printing single dimensional array");
        System.out.print("| ");
        for (int i:arr){

            System.out.print(i + " ");
        }
        System.out.println("|");

    }
}

