package com.example.december11;




public class MainClass extends AnotherClass{

    public void display(){

        System.out.println("this is main class display method");
    }

    public void thisDemo(){

        this.display();
    }


    public static void main(String[] args){

        AnotherClass obj= new MainClass();
        obj.show();


        MainClass mc= new MainClass();
        mc.thisDemo();













    }
}
