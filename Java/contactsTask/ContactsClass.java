package com.example.contactsTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactsClass implements Operable{

    String number;
    String numberTag;
    String emailID;
    String mailTag;
    String doorNumber;
    String cityName;
    String postalCode;
    String country;
    StringBuilder notes=new StringBuilder();
    String REGEX="^[a-zA-Z0-9+_.-]+@(.+)[a-zA-Z]$";
    Pattern pattern=Pattern.compile(REGEX);

    HashMap<Integer, Contact> fieldsClassHashMap = new HashMap<>();
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    Scanner sF= new Scanner(System.in);

    public void createContacts() throws IOException{
        Contact contactsClass= new Contact();
        String cContactName= new String();
        System.out.println("---------------Contact Name---------------\n");
        do{
            System.out.print("Enter the Contact's Name: ");
            cContactName=bf.readLine();
            if (cContactName==""){
                System.out.println("Name cannot be empty!!!!");
            }
        }while(cContactName.length()<=0);
        contactsClass.setContactName(cContactName);
        System.out.println("---------------Contact Number---------------\n");
        boolean mainNumFlag;
        HashMap<String, String> cNumber= new HashMap();
        do{

            do{
                System.out.print("Enter Contact's Number Tag:");
                numberTag= bf.readLine();
                if(numberTag=="") {
                    System.out.println("Number tag cannot be empty!!!!");
                }

            }while(numberTag.length()<=0);

            boolean flag;
            do{
                System.out.print("Enter the number for "+ numberTag+": ");
                number= bf.readLine();
                flag=true;
                if(number.length()<10 || number.length()>15) {
                    System.out.println("Invalid number Length");
                    flag=false;
                }
                try {
                    long l=Long.parseLong(number);
                }
                catch(NumberFormatException E){
                    System.out.println("Number cannot should be numeric values only");
                    flag=false;
                }
            }while(flag!=true);

            cNumber.put(numberTag,number);
            contactsClass.setContactNumber(cNumber);
            mainNumFlag=true;
            System.out.println("Do you want to add more numbers?\n1.Yes\n2.No");
            System.out.print("Input:");
            try {

                short moreNumberInput = sF.nextShort();
                switch (moreNumberInput) {
                    case 1:
                        mainNumFlag=false;
                        break;
                    case 2:
                        mainNumFlag=true;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        mainNumFlag = false;
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Encountered an Exception while adding Number: "+ e);
                mainNumFlag=false;
            }
        }while (mainNumFlag==false);





        System.out.println("---------------Contact Email---------------\n");
        boolean mainMailFlag;
        HashMap<String, String> cEmail= new HashMap();
        do{

            do{
                System.out.println("Enter Contact's Mail Tag:");
                mailTag= bf.readLine();
                if(mailTag=="") {
                    System.out.print("Mail tag cannot be empty!!!!");
                }

            }while(mailTag.length()<=0);

            boolean flag;
            do{
                System.out.print("Enter the Mail ID for "+ mailTag + ": ");
                emailID= bf.readLine();
                flag=true;
                Matcher matcher=pattern.matcher(emailID);
                if(!matcher.matches()) {
                    System.out.println("Given mail id is not a valid mail ID");
                    flag=false;
                }
                if(emailID=="") {
                    System.out.println("Mail ID cannot be empty!!!!");
                    flag=false;
                }
            }while(flag!=true);

            cEmail.put(mailTag,emailID);
            contactsClass.setContactEmail(cEmail);
            mainMailFlag=true;
            System.out.println("Do you want to add more Mail IDs?\n1.Yes\n2.No");
            System.out.print("Input:");
            try {
                short moreMailInput = sF.nextShort();
                switch (moreMailInput) {
                    case 1:
                        mainMailFlag=false;
                        break;
                    case 2:
                        mainMailFlag=true;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        mainMailFlag = false;
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Encountered an Exception while adding mail: "+ e);
                mainMailFlag=false;
            }

        }while(mainMailFlag==false);


        System.out.println("---------------Contact Address---------------\n");
        //HashMap<String,String>cAddresses= new HashMap<String, String>();
        AddressClass<String, String, String, String > addr= new AddressClass<>();


        System.out.print("Enter Address: ");
        doorNumber=bf.readLine();
        addr.setAddress(doorNumber);
        System.out.print("Enter the City Name: ");
        cityName=bf.readLine();
        addr.setCity(cityName);
        System.out.print("Enter the Postal code: ");
        postalCode=bf.readLine();
        addr.setPostal(postalCode);
        System.out.print("Enter the Country Name: ");
        country=bf.readLine();
        addr.setCountry(country);
        contactsClass.setContactAddress(addr);

        System.out.println("---------------Contact Notes---------------\n");
        System.out.println("Enter some Notes for the contact:");
        notes=new StringBuilder();

        do{
            notes.append(bf.readLine());
            notes.trimToSize();
        }while(notes.charAt(notes.length()-1)!='.');
        contactsClass.setContactNotes(notes);
        int srNo= fieldsClassHashMap.size()+1;
        fieldsClassHashMap.put(srNo,contactsClass);
        System.out.println("Contact Added!!!!!!");
    }
    public void displayContacts(){

        try {

            for (int i=1;i<=fieldsClassHashMap.size();i++) {
                System.out.print("Contact Name:");
                System.out.print(fieldsClassHashMap.get(i).getContactName()+ "\n");
                System.out.println("Contact Number(s):");
                for (String tag:
                        fieldsClassHashMap.get(i).getContactNumber().keySet()) {
                    System.out.println(tag+": "+ fieldsClassHashMap.get(i).getContactNumber().get(tag));
                }
                System.out.println("Contact Email ID(s):");
                for (String tag:
                        fieldsClassHashMap.get(i).getContactEmail().keySet()) {
                    System.out.println(tag+": "+ fieldsClassHashMap.get(i).getContactEmail().get(tag));
                }
                System.out.println("Contact Address:");
                System.out.println("Address: "+ fieldsClassHashMap.get(i).getContactAddress().getAddress());
                System.out.println("City: "+ fieldsClassHashMap.get(i).getContactAddress().getCity());
                System.out.println("Country: "+ fieldsClassHashMap.get(i).getContactAddress().getCountry());
                System.out.println("PostalCode: "+ fieldsClassHashMap.get(i).getContactAddress().getPostal());


                System.out.println("Notes:");
                System.out.println(fieldsClassHashMap.get(i).getContactNotes());

            }
            System.out.println(fieldsClassHashMap.size()+" Contacts Displayed!!!!!!");
        }
        catch (Exception e){
            System.out.println("exception at display function"+e);
        }

    }
    public void displayNameOnly()throws IOException{
        Iterator <Map.Entry<Integer,Contact>> IT= fieldsClassHashMap.entrySet().iterator();
        System.out.print("Enter the name to search by name:");
        System.out.println("Enter 'exit' to exit");
        String search= new String(bf.readLine());
        if (search.equals("exit")) return;
        int count=0;
        while(IT.hasNext()){
            Map.Entry<Integer, Contact> entry= IT.next();
            String[] subNames= entry.getValue().getContactName().split("\\s");

            for (String str:
                 subNames) {
                if (str.startsWith(search)){
                    count++;
                    System.out.println( count+". " + entry.getValue().getContactName());
                    break;
                }
            }


        }
        if (count<=0){
            System.out.println("No Entry found based on your criteria");
        }


    }
    public void deleteContact(){
        try {
            Iterator <Map.Entry<Integer,Contact>> IT= fieldsClassHashMap.entrySet().iterator();
            System.out.println("Which contact do you want to delete??\nEnter the contact's name?");
            System.out.println("Enter 0 to cancel the operation.");
            System.out.print("Your Input: ");
            String name= bf.readLine();
            while(IT.hasNext()) {
                Map.Entry<Integer, Contact> entry = IT.next();
                if (entry.getValue().getContactName().contains(name)) {
                    IT.remove();
                    System.out.println("Contact removed successfully");
                }
            }
            }
        catch (Exception e){
            System.out.println("Exception at delete method :" +e);
            }
    }
    public void editContact(){
            try {
                Iterator <Map.Entry<Integer,Contact>> IT= fieldsClassHashMap.entrySet().iterator();

                System.out.println("Which contact do you want to Edit??\nEnter the contact's name?");
                System.out.println("Enter 0 to cancel the operation.");
                System.out.print("Your Input: ");
                String name= bf.readLine();
                int num;
                short sEdit;
                while(IT.hasNext()){
                    Map.Entry<Integer, Contact> entry= IT.next();
                    if(entry.getValue().getContactName().equals(name)) {
                        num= entry.getKey();
                        do{
                        System.out.println("1.Contact Name\n2.Contact Number\n3.Contact Email ID\n4.Contact Address\n5.Contact Notes\n6.Exit");
                        System.out.println("Select the field you want to edit: ");
                        sEdit= sF.nextShort();
                        switch (sEdit) {
                        case 1:
                            String eName = new String();
                            System.out.println("Enter the New Name:");
                            eName = bf.readLine();
                            fieldsClassHashMap.get(num).setContactName(eName);
                            break;
                        case 2:
                            for (String tag :
                                fieldsClassHashMap.get(num).getContactNumber().keySet()) {
                                System.out.println(tag + ": " + fieldsClassHashMap.get(num).getContactNumber().get(tag));
                            }
                            System.out.println("Enter the contact's tag name to edit:");
                            numberTag = bf.readLine();
                            if (fieldsClassHashMap.get(num).getContactNumber().containsKey(numberTag)) {
                                System.out.print("Enter the new Number for " + numberTag + ": ");
                                number = bf.readLine();
                                fieldsClassHashMap.get(num).getContactNumber().replace(numberTag, number);
                                }
                            else System.out.println("Tag " + numberTag + " Not found!!");

                            System.out.println("Contact Updated successfully");
                            break;


                    case 3:

                            for (String tag :
                                fieldsClassHashMap.get(num).getContactEmail().keySet()) {
                            System.out.println(tag + ": " + fieldsClassHashMap.get(num).getContactEmail().get(tag));
                            }
                            System.out.println("Enter the contact's tag name to edit:");
                            mailTag = bf.readLine();
                            if (fieldsClassHashMap.get(num).getContactNumber().containsKey(mailTag)) {
                                System.out.print("Enter the new Number for " + mailTag + ": ");
                                emailID = bf.readLine();
                                fieldsClassHashMap.get(num).getContactNumber().replace(mailTag, emailID);
                            }
                            else System.out.println("Tag " + mailTag + " Not found!!");

                            System.out.println("Contact Updated successfully");


                    case 4:
                            System.out.print("Enter the address: ");
                            doorNumber = bf.readLine();
                            fieldsClassHashMap.get(num).getContactAddress().setAddress(doorNumber);
                            System.out.print("Enter the City Name: ");
                            cityName = bf.readLine();
                            fieldsClassHashMap.get(num).getContactAddress().setCity(cityName);
                            System.out.print("Enter the Country Name: ");
                            country = bf.readLine();
                            fieldsClassHashMap.get(num).getContactAddress().setCountry(country);
                            System.out.print("Enter the Postal code: ");
                            postalCode = bf.readLine();
                            fieldsClassHashMap.get(num).getContactAddress().setPostal(postalCode);
                            break;
                    case 5:
                            System.out.println("Enter the new Notes for the contact:");
                            notes = new StringBuilder();

                            do {
                                Scanner sNotes = new Scanner(System.in);
                                notes.append(sNotes.nextLine());
                                notes.trimToSize();
                            } while (notes.charAt(notes.length() - 1) != '.');
                            fieldsClassHashMap.get(num).setContactNotes(notes);
                            break;
                    case 6:
                        return;
                    default:
                        System.out.println("Invalid Input");


                }
                        }while(sEdit!=6);
                }

                }
            }
            catch (Exception e){
                System.out.println("Exception at editContact function: "+e);
            }


    }

    public void readFromCSV(){
        try{
        String fileName="/Users/user/Documents/AndroidStudioProjects/JavaFiles/src/main/java/com/example/contactsTask/format.csv";

        String str="";
            BufferedReader bf= new BufferedReader(new FileReader(fileName));
            bf.readLine();
            while ((str=bf.readLine())!=null){
                Contact contactsClass= new Contact();
                String[] values= str.split(",");
                contactsClass.setContactName(values[0]+ " " + values[1]);
                HashMap<String,String> conNum=new HashMap<>();
                conNum.put("Phone1", values[7]);
                conNum.put("Phone2", values[8]);
                contactsClass.setContactNumber(conNum);
                HashMap<String,String> conMail=new HashMap<>();
                conMail.put("email", values[9]);
                contactsClass.setContactEmail(conMail);
                /*HashMap<String,String> conAddr= new HashMap<>();
                conAddr.put("Door Num",values[3]);
                conAddr.put("City",values[4]);
                conAddr.put("Postal Code",values[6]);
                conAddr.put("Country",values[5]);
                contactsClass.setContactAddr(conAddr);*/
                AddressClass<String,String,String,String> conAddress= new AddressClass<>();
                conAddress.setAddress(values[3]);
                conAddress.setCity(values[4]);
                conAddress.setCountry(values[5]);
                conAddress.setPostal(values[6]);
                contactsClass.setContactAddress(conAddress);
                StringBuilder sb= new StringBuilder(values[10]);
                contactsClass.setContactNotes(sb);
                int srNo= fieldsClassHashMap.size()+1;
                fieldsClassHashMap.put(srNo,contactsClass);
            }
            System.out.println("File read Successfully");
        }

        catch (Exception e){
            System.out.println(e);
        }
    }

    public void writeToFile(){

        StringBuilder storage= new StringBuilder("");
        String fileName="/Users/user/Documents/AndroidStudioProjects/JavaFiles/src/main/java/com/example/contactsTask/writer.csv";
        try {

            storage.append("ContactName, Phone1, Phone2, Email, DoorNo, City, Country, PostalCode, Notes\n");
            for (int i=1;i<=fieldsClassHashMap.size();i++) {

                storage.append(fieldsClassHashMap.get(i).getContactName()+ ", ");
                for (String tag:
                        fieldsClassHashMap.get(i).getContactNumber().keySet()) {
                    storage.append(fieldsClassHashMap.get(i).getContactNumber().get(tag)+", ");
                }
                for (String tag:
                        fieldsClassHashMap.get(i).getContactEmail().keySet()) {
                    storage.append(fieldsClassHashMap.get(i).getContactEmail().get(tag)+", ");
                }

                storage.append(fieldsClassHashMap.get(i).getContactAddress().getAddress()+", ");
                storage.append(fieldsClassHashMap.get(i).getContactAddress().getCity()+", ");
                storage.append(fieldsClassHashMap.get(i).getContactAddress().getCountry()+", ");
                storage.append(fieldsClassHashMap.get(i).getContactAddress().getPostal()+", ");
                /*for (String tag:
                        fieldsClassHashMap.get(i).getContactAddr().keySet()) {
                    storage.append(fieldsClassHashMap.get(i).getContactAddr().get(tag)+", ");
                }*/
                storage.append(fieldsClassHashMap.get(i).getContactNotes()+"\n");

            }


            /*for (int i=1;i<=fieldsClassHashMap.size();i++) {

                storage.append(fieldsClassHashMap.get(i).getContactName()+ "\n");
                storage.append("Contact Number(s):\n");
                for (String tag:
                        fieldsClassHashMap.get(i).getContactNumber().keySet()) {
                    storage.append(tag+": "+ fieldsClassHashMap.get(i).getContactNumber().get(tag)+"\n");
                }
                storage.append("Contact Email ID(s):\n");
                for (String tag:
                        fieldsClassHashMap.get(i).getContactEmail().keySet()) {
                    storage.append(tag+": "+ fieldsClassHashMap.get(i).getContactEmail().get(tag)+"\n");
                }
                storage.append("Contact Address:\n");
                for (String tag:
                        fieldsClassHashMap.get(i).getContactAddr().keySet()) {
                    storage.append(tag+": "+ fieldsClassHashMap.get(i).getContactAddr().get(tag)+"\n");
                }
                storage.append("Notes:");
                storage.append(fieldsClassHashMap.get(i).getContactNotes()+"\n\n");

            }*/

            BufferedWriter bfw= new BufferedWriter(new FileWriter(fileName));
            bfw.write(storage.toString());
            bfw.close();
            System.out.println("Data Written Successfully to writer.csv");
        }
        catch (Exception e){
            System.out.println("Exception in write to file method: "+ e);
        }
    }

    public static void main(String[] args){

        ContactsClass cls=new ContactsClass();
        Scanner sn = new Scanner(System.in);
        String displayText = "ContactList Main Menu\n1.Create Contact\n2.Edit Contact\n3.Delete Contact\n4.Display Contact\n5.Read From CSV\n6.Write to file\n7.Exit\nEnter Your Option:";
        short input;
        try {
            do {
                System.out.print(displayText);
                input = sn.nextShort();
                switch (input) {
                    case 1:
                        short ip;
                        try {
                            do {
                                System.out.println("Create Contacts");
                                cls.createContacts();
                                System.out.print("\nDo you want to create another contact?\n1.Yes\n2.No\nInput:");
                                Scanner s = new Scanner(System.in);
                                ip = s.nextShort();
                            } while (ip != 2);
                        }
                        catch(Exception e){
                                System.out.println("Encountered an Exception: "+ e);
                            }
                        break;
                    case 2:
                        System.out.println("Edit Contacts");
                        cls.displayNameOnly();
                        cls.editContact();
                        break;
                    case 3:
                        System.out.println("Delete Contacts");
                        cls.displayNameOnly();
                        cls.deleteContact();
                        break;
                    case 4:
                        System.out.println("Display Contacts");
                        cls.displayContacts();
                        break;
                    case 5:
                        System.out.println("Reading From Format.csv");
                        cls.readFromCSV();
                        break;
                    case 6:
                        System.out.println("Writing to text file");
                        cls.writeToFile();
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input please enter a valid input.");
                }
            }while (input != 7);
        }
        catch(Exception e){
            System.out.println("Encountered an Exception at Main Menu: "+ e);
        }






    }

}
