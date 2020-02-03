package com.example.javafiles;

import java.util.Scanner;

public class ArrayExamples {





    public static void main(String [] args){

//        char[] arr={'b','d','f','g','h','a'};
//        char[] temp = new char[arr.length];
//
//        char small, big;





        //Multi dimensional arrays

        /*int [][] brr={{8,8,7,9,7,7,2,0,6,3},
                        {9,9,3,0,4,5,1,2,3,3},
                            {9,7,6,9,5,4,4,5,7,0}};


        System.out.println(("Printing with for loop:"));

        for (int i=0;i<=brr.length-1;i++){
            for (int j=0;j<=brr[i].length-1;j++){

                System.out.print(brr[i][j]);
            }
            System.out.println();
        }


        System.out.println("printing with For Each loop");

        for (int[] i: brr) {
            for (int j:
                 i) {
                System.out.print(j);
            }
            System.out.println();
        }*/


        //addition of multidimensional arrays

/*
        int[][] a1={{1,2,3},
                {3,1,2},
                {4,5,6}
        };

        int[][] a2={{3,4,1},
                {1,1,1},
                {2,2,2}
        };


        int[][] c=new int[3][3];

        for(int i=0;i<c.length;i++){

            for(int j=0;j<c[i].length;j++){

                c[i][j]=a1[i][j]+a2[i][j];

            }

        }


        for (int[] i: a1) {
            System.out.print("| ");
            for (int j: i)
            {
                System.out.print(j+ " ");
            }
            System.out.println("|");
        }

        System.out.println("+");

        for (int[] i: a2) {
            System.out.print("| ");
            for (int j:
                    i) {
                System.out.print(j+" ");
            }
            System.out.println("|");
        }

        System.out.println("=");

        for (int[] i:
             c) {
            System.out.print("| ");
            for (int j:
                 i) {
                System.out.print(j + " ");
            }
            System.out.println("|");
        }*/



//Sorting method calls

        SortClass sc=new SortClass();
        int[] ar={10,5,11,-3,1};


        //Bubble sort
//        System.out.println("Bubble Sort");
//        sc.Bubble(ar);

        //SelectionSort
//        System.out.println("Selection Sort");
//        sc.SelectionSort(ar);

        //InsertionSort


        System.out.println("Insertion Sort");
        sc.InsertionSort(ar);




        for (int i:
             ar) {

            System.out.println((i));

        }



//Search method Call
/*

        int[] sample={4,6,3,7,10,-3,1};

        Scanner sn =new Scanner(System.in);

        System.out.println("Enter the element to Search:");
        int ele=sn.nextInt();

        //Static method call using class name
        //No object creation required for calling static method

        int index =SearchClass.binarySearch(sample,ele);

        if (index!=-1){
            System.out.println("The element " + ele + " was found at position " + index);
        }
        else
        {
            System.out.println("The element was not found");
        }


*/


//Array class methods





    }
}
