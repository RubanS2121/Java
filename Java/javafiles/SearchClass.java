package com.example.javafiles;

public class SearchClass {

    //Static method
    static int binarySearch(int[] arr,int ele ){

        int index=-1;

        for(int i=0; i<arr.length-1;i++){

            if (arr[i]==ele){
                index=i;
                break;
            }
        }

        return index+1;
    }
}
