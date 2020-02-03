package com.example.InnerClasses;

import com.example.contactsTask.AddressClass;
import static java.lang.System.out;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class InnerClassDemo implements Watchable {

    void printDate(){

        System.out.println("Thursday!!");
    }


    public static void main(String [] args){

        A_Class obj= new A_Class();

        InnerClassDemo In= new InnerClassDemo(){
             void printDate(){          // Inner Anonymous Class
                Date Dt= new Date();
                 LocalDate LD= LocalDate.now();


                System.out.println(LD.getDayOfMonth());
            }
        };

        Printable P= () -> {
            System.out.println("This is Student Details");
        };

        P.printMyLine();
        In.printDate();


        A_Class.Marksheet M= obj. new Marksheet();// For Member Inner Class
        A_Class.Address Addr= new A_Class.Address();// For Static Inner Class

        A_Class.Marksheet.InnerAddressClass iac=M.new InnerAddressClass();




        obj.setsName("Kapil");
        obj.setsRollNo(21);


        HashMap<String, Integer> H=new HashMap<String, Integer>();
        H.put("English",99);
        H.put("Maths",88);

        M.setHM(H);

        AddressClass<String, String, String, String> AC= new AddressClass<>();
        AC.setAddress("18/7 Vantage Castle");
        AC.setCity("Chennai");
        AC.setCountry("India");
        AC.setPostal("600020");

        Addr.setAC(AC);


        out.printf("Student Name %s with RollNo: %d , has scored  %d in English and %d in Maths\n", obj.getsName(),obj.getsRollNo(),M.getHM().get("English"), M.getHM().get("Maths"));
        System.out.printf("He lives At : %s, %s, %s, %s\n", Addr.getAC().getAddress(),Addr.getAC().getCity(),Addr.getAC().getCountry(),Addr.getAC().getPostal());
        In.grow();

        List<Integer> value= Arrays.asList(1,2,3,4,5,6);
        value.forEach(i -> System.out.println(i));

        double d=223.11;
        int r=(int)d;
    }
}
