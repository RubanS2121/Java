package com.example.javafiles;
import java.util.Scanner;

public class FirstClass extends CarClass{

    public static void main(String args[]){

        CarClass volvo=new CarClass();
        System.out.println("Enter the number of doors");
        Scanner in= new Scanner(System.in);
        int doors=in.nextInt();
        Scanner st= new Scanner(System.in);
        System.out.println("Enter the fuel type");
        String fuel=st.nextLine();
        volvo.wheels();
        volvo.doors(doors);
        AbsDemo ab=new AbsDemo(){
        };
        ab.setFuelType(fuel);

        System.out.println("The Fuel Type is:" + ab.getFuelType());






    }
}
