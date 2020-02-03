package com.example.task12dec19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AllSortClass {

    public int[] sortArray(int[] arr){


        for(int i=0; i< arr.length-1;i++){
            for(int j=0; j<arr.length-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){

        Scanner sn= new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sn.nextInt();

        double db=12.0;

        try {
            if(len<=0)
                throw new NegativeArrayLengthException("Array length cannot be less than zero");
        }
        catch(Exception e){
            System.out.println("Exception:" + e.getMessage());
            System.exit(0);
        }

        int [] arr= new int[len];
        System.out.println("Enter the elements of the array: ");
        try {
            for (int i = 0; i < len; i++) {
                arr[i] = sn.nextInt();
            }
        }
        catch (StackOverflowError ex){
            System.out.println("Stack overflow error: " + ex);
        }

        catch (Exception e){
            System.out.println("Unknown error: " + e);
        }

        finally {

            System.out.println("Printing the elements of the array");
            System.out.print("| ");
            for (int j:
                    arr) {
                System.out.print(j + " ");
            }
            System.out.println("|");
        }

        System.out.println("Printing the sorted Array: ");

        AllSortClass s=new AllSortClass();
        arr=s.sortArray(arr);
        System.out.print("| ");
        for (double j:
             arr) {
            String format=new DecimalFormat("##.00").format(j);
            System.out.print( format + " ");
        }
        System.out.println("|");
    }
}
