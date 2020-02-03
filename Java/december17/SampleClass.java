package com.example.december17;

import com.example.contactsTask.AddressClass;
import com.example.contactsTask.ContactsClass;
import com.example.december10.Sample;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class SampleClass implements Serializable {

    String tag;
    String value;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format(tag+ ": " + value);
    }

    public static void main(String[] args) throws IOException {

        SampleClass S= new SampleClass();
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the tag name: ");
        S.setTag(bf.readLine());
        System.out.println("Enter the value for the Tag: ");
        S.setValue(bf.readLine());
        System.out.println("over ridden tostring call");
        System.out.println(S.toString());

        NumericClass<ContactsClass> num=new NumericClass<>();
        System.out.println(num.getValue());
        num.getValue();
        //NumericClass<Character> ch= new NumericClass<>();  // Shows Error
        NumericClass<Double> n= new NumericClass<>();
        n.setValue(7.22);
        System.out.println(n.getValue());
        n.show();



        StringClass<String> st= new StringClass<>();
        st.setValue("BCMC");
        System.out.println(st.getValue());
        st.show();



        String filename= "file.txt";

        try{
            FileOutputStream file= new FileOutputStream(filename);
            ObjectOutputStream o= new ObjectOutputStream(file);
            o.writeObject(n);
            o.writeObject(S);

            o.close();
            file.close();


        }
        catch (Exception e){
            System.out.println("Exception"+ e);
        }

    }



}
