package com.example.task09dec19;

public class MainClass {


    public static void main(String[] args){

        SimpleArrayClass SA=new SimpleArrayClass();

        TwoDArray T=new TwoDArray();

        int arr[]=SA.getArrayDetails();

        SA.printArray(arr);


        System.out.println("Converting to 2 D Array");
        int brr[][]=T.convertArray(arr);

       /* for (int[] i:brr) {
            for (int j:
                 i) {
                System.out.print(j + " ");
            }
            System.out.println();

        }*/

        for(int i=0; i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++){

                System.out.print(brr[i][j]+ " ");

            }
            System.out.println("");
        }

        }








    }

