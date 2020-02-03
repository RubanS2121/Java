package com.example.december20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StackMultiplier {

    static final int MAX=5;
    int top;
    int[] stack;


    StackMultiplier(){
        top=-1;
        stack= new int[MAX];
    }


    int pop(){


        if (top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else if(stack.length - top> stack.length/2||stack.length==MAX){
           stack=Arrays.copyOf(stack, stack.length/2);
            System.out.println("Stack size decreased to "+ stack.length);
        }
            int x= stack[top];
            top--;
            return x;

    }


    void push(int num){

        if (stack.length-top<=1){
            stack= Arrays.copyOf(stack,stack.length*2);
            System.out.println("Stack size increased to " + stack.length);
        }

            top++;
            stack[top]= num;


    }

    void showTop(){
        System.out.println(stack[top]);
    }

    void multiply(){
        if (top<1){
            System.out.println("No sufficient values to multiply");
            return;
        }
        else
        {
            int x=pop();
            int y=pop();
            push(x*y);
            System.out.println("Product pushed to top of stack");
        }
    }

    public static void main(String[] args){
        StackMultiplier S= new StackMultiplier();
        Scanner sn= new Scanner(System.in);
        int k;
        do{
            System.out.print("1.Push\n2.Pop\n3.Multiply\n4.Peek\n5.Exit\nEnter Your Choice: ");
            k= sn.nextInt();
            switch (k){
                case 1:
                        int value;
                        System.out.print("Enter your value to push: ");
                        value= sn.nextInt();
                        S.push(value);
                        System.out.println("Value Pushed!");
                        break;
                case 2:
                        int current=S.pop();
                        System.out.println("Popped: "+ current);
                        break;
                case 3:
                        S.multiply();
                        break;
                case 4:
                        S.showTop();
                        break;
                case 5:
                    return;
                default:
                        System.out.println("Invalid input");

            }

        }while(k!=5);

    }
}
