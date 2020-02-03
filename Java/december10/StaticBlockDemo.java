package com.example.december10;
import com.example.december10.Sample;
import static com.example.december10.Sample.display;
public class StaticBlockDemo {





    static {
        System.out.println("Hello this is static block");
    }

    public static void main(String[] args){

        System.out.println("This is main block");

        Sample sm=new Sample();


        String a = "sdfsdfa";
        a=a+"hhhh";
        System.out.println(a);
        a+="hello";
        System.out.println(a);

        sm.display();// static method imported from another class called using object of class

        display(); // static method imported from another class called without using object of class


    }


}
