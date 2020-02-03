package com.example.InnerClasses;

import com.example.contactsTask.AddressClass;

import java.util.HashMap;

public class A_Class {

    int sRollNo;
    String sName;

    public int getsRollNo() {
        return sRollNo;
    }

    public void setsRollNo(int sRollNo) {
        this.sRollNo = sRollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    class Marksheet{        //Inner Member Class

        HashMap<String, Integer>  HM= new HashMap<>();

        public HashMap<String, Integer> getHM() {
            return HM;
        }

        public void setHM(HashMap<String, Integer> HM) {
            this.HM = HM;
        }


        class InnerAddressClass{

            int number;
        }

    }


    static class Address{

       AddressClass<String, String, String, String> AC= new AddressClass<>();

        public AddressClass<String, String, String, String> getAC() {
            return AC;
        }

        public void setAC(AddressClass<String, String, String, String> AC) {
            this.AC = AC;
        }
    }







}
