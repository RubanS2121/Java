package com.example.december17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationClass implements Serializable{

    public static void main(String [] args)throws IOException,ClassNotFoundException {

        NumericClass<Number> nm=null;
        SampleClass sm= null;

        String fileName="file.txt";
        FileInputStream f= new FileInputStream(fileName);
        ObjectInputStream O= new ObjectInputStream(f);

        nm=(NumericClass) O.readObject();
        System.out.println("De Serialized object's value of numeric class");
        System.out.println(nm.getValue());


        sm=(SampleClass) O.readObject();
        System.out.println("De Serialized object's value of SampleClass class");
        System.out.println(sm.toString());

    }
}
