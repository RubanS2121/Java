package com.example.javafiles;

public class SortClass {


    void Bubble(int[] arr){

        int len=arr.length;


        for(int i=0;i<len-1;i++){

            for (int j=0;j<len-i-1;j++){
                if (arr[j]>arr[j+1]) {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    void SelectionSort(int[] arr){

        int len=arr.length;

        for(int i=0;i<len-1;i++){
            int minind=i;
            for(int j=i+1;j<len;j++ ){

                if (arr[j]<arr[minind]){
                    minind=j;

                }
            }

            int temp=arr[minind];
            arr[minind]=arr[i];
            arr[i]=temp;
        }
    }

    void InsertionSort(int[] arr){


       int len=arr.length;

       for(int i=0; i<len;i++){
           int key=arr[i];
           int j=i-1;

           while (j>=0 && arr[j]>key){

               arr[j+1]=arr[j];
               j=j-1;

           }

           arr[j+1]=key;
       }

    }
}
