package com.example.contactListTask;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactFormat {

    String contactName;
    ArrayList<Long> contactNumber=new ArrayList<>();
    ArrayList<String> emailID=new ArrayList<>();
    HashMap<String,String> address= new HashMap<>();
    String notes;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public ArrayList<Long> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public ArrayList<String> getEmailID() {
        return emailID;
    }

    public void setEmailID(ArrayList<String> emailID) {
        this.emailID = emailID;
    }

    public HashMap<String, String> getAddress() {
        return address;
    }

    public void setAddress(HashMap<String, String> address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }



    public ContactFormat(String contactName, ArrayList<Long> contactNumber, ArrayList<String> emailID, HashMap<String, String> address, String notes) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.emailID = emailID;
        this.address = address;
        this.notes = notes;
    }

}
