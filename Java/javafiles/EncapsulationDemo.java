package com.example.javafiles;

public class EncapsulationDemo {

    protected int num1=5;
    protected int num2=4;
    protected int num3=6;

    public int getNum3() {
        return num3=num1+num2;
    }



    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }


    public void setNum2(int num2){
        this.num2=num2;
    }

    public int getNum2(){
        return num2;
    }



}
