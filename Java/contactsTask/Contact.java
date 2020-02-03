package com.example.contactsTask;
import java.util.HashMap;


public class Contact {


    String contactName;
    HashMap<String,String> contactNumber= new HashMap<>();
    HashMap<String, String> contactEmail= new HashMap<>();
    //HashMap<String,String> contactAddr= new HashMap<>();
    AddressClass<String,String,String,String> contactAddress= new AddressClass<>();
    StringBuilder contactNotes=new StringBuilder();




    //Name
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    //Number
    public HashMap<String, String> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(HashMap<String, String> contactNumber) {
        this.contactNumber = contactNumber;
    }

    //Email
    public HashMap<String, String> getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(HashMap<String, String> contactEmail) {
        this.contactEmail = contactEmail;
    }

   /* //Old Address
    public HashMap<String, String> getContactAddr() {
        return contactAddr;
    }

    public void setContactAddr(HashMap<String, String> contactAddr) {
        this.contactAddr = contactAddr;
    }*/

   //New Address
   public AddressClass<String, String, String, String> getContactAddress() {
       return contactAddress;
   }

    public void setContactAddress(AddressClass<String, String, String, String> contactAddress) {
        this.contactAddress = contactAddress;
    }

    //Notes
    public StringBuilder getContactNotes() {
        return contactNotes;
    }

    public void setContactNotes(StringBuilder contactNotes) {
        this.contactNotes = contactNotes;
    }

}
