package com.example.december20;

import java.util.Scanner;

public class QueueImplementation {

    int front;
    int back;
    int[] stack;
    final int MAX=10;

    QueueImplementation(){
        front=-1;
        back=-1;
        stack=new int[MAX];
    }

    public void Enqueue(int num){
        if(back>=MAX){
            System.out.println("Queue is full!!!");
        }
        else if (front==-1 && back==-1){
            front++;
            back++;
            stack[back]=num;
        }
        else{
            back++;
            stack[back]=num;
        }

    }

    public int Dequeue(){
        if (front>back){
            System.out.println("Queue is Empty!!!");
            return 0;
        }
        else
        {
            int num= stack[front];
            front++;
            return num;

        }
    }

    public void peekFront(){
        int num= stack[front];
        System.out.println("The Front element is:" + num);
    }

    public void peekRear(){
        int num= stack[back];
        System.out.println("The Rear element is :" + num);

    }

    public void showAll(){
        for (int i:
             stack) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){

        QueueImplementation QI= new QueueImplementation();
        Scanner sn= new Scanner(System.in);
        int k;
        do{
            System.out.print("1.Enqueue\n2.Dequeue\n3.Peek Front\n4.Peek Rear\n5.Show All\n6.Exit\nEnter Your Choice: ");
            k= sn.nextInt();
            switch (k){
                case 1:
                    int value;
                    System.out.print("Enter your value to Enqueue: ");
                    value= sn.nextInt();
                    QI.Enqueue(value);
                    System.out.println("Value Queued!");
                    break;
                case 2:
                    int current=QI.Dequeue();
                    System.out.println("Dequeued Element: "+ current);
                    break;
                case 3:
                    QI.peekFront();
                    break;
                case 4:
                    QI.peekRear();
                    break;
                case 5:
                    QI.showAll();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid input");

            }

        }while(k!=6);

    }
}
