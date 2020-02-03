package com.example.task09dec19;

import java.util.Scanner;

public class TwoDArray {


    public int[][] convertArray(int[] arr){

        double len=arr.length;


        //converting by taking no. of rows from user
        System.out.print("Enter the no. of cols you want:");
        Scanner sn= new Scanner(System.in);
        int rows=sn.nextInt();
        double quo=len/rows;
        int col=(int)quo;
        double extra=Math.floor(quo);

        if (extra>0){
            col+=1;
        }
        int brr[][]=new int[col][rows];




        // Printing without taking no. of rows or columns from user

       /* double sq= Math.sqrt(len);

        int m;
        m=(int)sq;
        double g=sq-Math.floor(sq);

        if (g>0) {
            m=m+1;
        }
        int brr[][]=new int[m][m];*/











        for(int i=0, k=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++,k++){
                if (k>=arr.length)
                    break;
                brr[i][j]=arr[k];

            }
        }

Double ig= new Double(2.3334);



        return brr;
    }
}
