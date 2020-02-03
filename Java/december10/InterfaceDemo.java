package com.example.december10;

public class InterfaceDemo implements InterfaceSample, Inter2{

    static String s ="kapil";


    @Override
    public void display(int sum) {
        System.out.println("The sum is " + sum);
    }

    public int add(int i , int j){

        int sum=0;

        sum=i+j;

        return sum;
    }

    public void display(){
        System.out.println("this is abstract method from interface 2");
    }

    public void show(){
        System.out.println("This is current class method");
    }



    public static void main(String[] args){

        InterfaceSample obj=new InterfaceDemo();
        Inter2 obj1 =new InterfaceDemo();



        int sum= obj.add(10,15);
        obj.display(sum);

        obj1.display();

        Inter2.displayContent();

        //obj.show();  this line does'nt work because of the interface object which we created



    }
}
