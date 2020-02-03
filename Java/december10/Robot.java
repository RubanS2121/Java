package com.example.december10;

import java.util.ArrayList;

public class Robot extends InterfaceDemo implements Permissions{


     int add(int i){
        System.out.println(i);
        if(i>=10){
            return i;
        }
        else{
            i= add(i+1)+i;


        }
        return i;

    }

    public static void main(String[] args){

         Robot obj = new Robot();


        int k=obj.add(1);
        System.out.println(k);


        //Robot obj =new Robot();

        if (obj instanceof Permissions){
            obj.display(); // marker class implementation


        }
        else{
            System.out.println("Access not found");;
        }

        ArrayList<String> arr= new ArrayList<>();
        arr.add("Hello");
        arr.add("bello");
        arr.add("Cello");
        System.out.println(arr);


    }


}
