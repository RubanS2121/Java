package com.example.task12dec19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElementFinderClass {

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

    public void findElement(int n, int[] arr){
        int smallest=0;
        int largest=0;
        int len=arr.length;

        smallest=arr[n-1];
        largest= arr[len-n];

        System.out.println("The "+ n +"th largest number in the array is: " + largest);
        System.out.println("The "+ n +"th smallest number in the array is: " + smallest);


    }

    public static void main(String[] args){

        Scanner sn= new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sn.nextInt();

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
            System.exit(0);
        }

        catch(InputMismatchException IM)
        {
            System.out.println("accepts only nueric values " + IM);
            System.exit(0);
        }

        catch (Exception e){
            System.out.println("Unknown error: " + e);
            System.exit(0);
        }

        finally {

            System.out.println("Printing the elements of the array");
            for (int j:
                 arr) {
                System.out.print(j + " ");
            }
        }


        System.out.print("Enter the Nth element you want to find: ");
        int nth=sn.nextInt();

        ElementFinderClass fc= new ElementFinderClass();
        arr=fc.sortArray(arr);
        fc.findElement(nth,arr);

    }
}
