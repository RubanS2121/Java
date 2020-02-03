package com.example.december12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewClass{

    public static void main(String[] args){
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String str=bf.readLine();



        }
        catch (IOException io)
        {
            System.out.println(io);
        }

        }




}
