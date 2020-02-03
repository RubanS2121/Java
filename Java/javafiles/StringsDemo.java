package com.example.javafiles;
import java.lang.reflect.Array;
import java.util.Scanner;

public class StringsDemo {

public static void main(String args []) {


    //simple char to string
   /* char[] helloArray = {'h', 'e', 'l', 'l', 'o', 'B', 'H', 'A', 'I'};
    String helloString = new String(helloArray);
    System.out.println(helloString);
    helloString="java";
    System.out.println(helloString);*/


    char[] helloArray = {'F','U','L','L','C','R','E','A','T','I','V','E'};
    Scanner sn=new Scanner(System.in);
    System.out.println(("Enter the no of shifts"));
    int shift=sn.nextInt();
    int len=helloArray.length-1;

    char [] tempArray=new char[shift];

    for(int i=0;i<shift; i++){
        tempArray[i]=helloArray[i];
    }


    for(int j=shift;j<=len; j++){
        helloArray[j-shift]=helloArray[j];
    }

    int shiftlen=helloArray.length-shift;
    for(int k=0;(k<=tempArray.length-1); k++){
        helloArray[shiftlen]=tempArray[k];
        shiftlen++;
    }

    System.out.println(helloArray);




/*int a[]={5,4,3,2,1};
int in,temp;
Scanner s = new Scanner(System.in);
in = s.nextInt();
for(int i=0;i<in;i++)
{
for(int j=0;j<4;j++)
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;

}
}
for(int k=0;k<5;k++)
{

System.out.print(a[k]);
}*/







   /* //Palindrome and .length
    String temp="";

    Scanner in= new Scanner(System.in);
    System.out.println("Enter a Text");

    String txt= in.nextLine();

    int len=txt.length();
    int i=len-1;
    while(i>=0){
        System.out.println(txt.charAt(i));
        temp=temp+txt.charAt(i);
        i--;
    }
    if (txt.equals(temp))
    System.out.println("It is a Palindrome");
    else
    System.out.println("It is not a palindrome");*/














        }
}
