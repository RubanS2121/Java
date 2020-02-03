package com.example.december11.ExceptionDemo;
import com.example.task09dec19.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionsClass {

    public void excep(){
       /*
       ArithmeticException
       It is thrown when an exceptional condition has occurred in an arithmetic operation.

        ArrayIndexOutOfBoundsException
        It is thrown to indicate that an array has been accessed with an illegal index.
        The index is either negative or greater than or equal to the size of the array.

        ClassNotFoundException
        This Exception is raised when we try to access a class whose definition is not found

        FileNotFoundException
        This Exception is raised when a file is not accessible or does not open.

        IOException
        It is thrown when an input-output operation failed or interrupted

        InterruptedException
        It is thrown when a thread is waiting , sleeping , or doing some processing , and it is interrupted.

        NoSuchFieldException
        It is thrown when a class does not contain the field (or variable) specified

        NoSuchMethodException
        It is thrown when accessing a method which is not found.

        NullPointerException
        This exception is raised when referring to the members of a null object. Null represents nothing

        NumberFormatException
        This exception is raised when a method could not convert a string into a numeric format.

        RuntimeException
        This represents any exception which occurs during runtime.

        StringIndexOutOfBoundsException
        It is thrown by String class methods to indicate that an index is either negative than the size of the string*/
    }

    public static void main(String[] args) throws IOException {
    double i, k=0;
    int j;


        Scanner sn= new Scanner(System.in);
        System.out.print("Enter the value of i:");
        i=sn.nextInt();
        System.out.print("Enter the value of j");
        j=sn.nextInt();
        String str="";






        try (BufferedReader obj1= new BufferedReader(new InputStreamReader(System.in))){
            k=(int)i/j;

            str=obj1.readLine();
        }
        catch (ArithmeticException ex){

            System.out.println("Arithmetic exception: " + ex);
        }

        catch(Exception e){
            System.out.println("Unknown error :" + e);
        }

        finally {
            System.out.println("The quotient is "+ k);
            System.out.println(str);
        }
    }
}
