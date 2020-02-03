package com.example.contactListTask;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Scanner;

public class ContactListClass {

    public boolean validateName(String contactName) {
        if (contactName == "") {
            System.out.println("Contact Name cannot be negative");
            return false;
        } else
            return true;
    }
    public boolean validateNumber(ArrayList<Long> cN) {

        if (cN.isEmpty() == true) {
            System.out.println("Contact number cannot be empty");
            return false;
        }

        for (long i :
                cN) {
            Long I= new Long(i);
            if (I.toString().length() < 10 || I.toString().length() > 15) {
                System.out.println("Invalid Contact Number!");
                return false;
            }
        }
        return true;
    }
    public boolean validateEmail (ArrayList < String > cEmail) {
        for (String str:
                cEmail) {


        }
        return true;

    }


    public void createContact (ArrayList<ContactFormat> arr) {

        String contactName;
        ArrayList<Long> contactNumber = new ArrayList<>();
        ArrayList<String> contactEmailID = new ArrayList<>();
        HashMap<String, String> address = new HashMap<>();
        String notes;


        Scanner sName = new Scanner(System.in);
        System.out.print("Enter contact Name:");
        contactName = sName.nextLine();

        //TAKING NUMBERS
        Scanner sNumber = new Scanner(System.in);
        System.out.println("Enter Contact's Number:");
        Long num = sNumber.nextLong();
        contactNumber.add(num);
        System.out.println("Do you want to add more numbers?\n1.Yes\n2.No");
        Scanner sMoreInput= new Scanner(System.in);
        short moreNumberInput = sMoreInput.nextShort();
        while (moreNumberInput != 2) {
            switch (moreNumberInput) {
                case 1:
                    System.out.println("Enter Contact's Number:");
                    num = sNumber.nextLong();
                    contactNumber.add(num);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Do you want to add more numbers?\n1.Yes\n2.No");
            moreNumberInput = sMoreInput.nextShort();

        }


        //TAKING EMAIL IDS
        Scanner sEmail=new Scanner(System.in);
        System.out.println("Enter Contact's Email ID:");
        String emailId = sEmail.nextLine();
        contactEmailID.add(emailId);
        System.out.println("Do you want to add more mail IDs?\n1.Yes\n2.No");
        Scanner sMoreEInput= new Scanner(System.in);
        short moreEmailInput = sMoreEInput.nextShort();
        while (moreEmailInput != 2) {
            switch (moreEmailInput) {
                case 1:
                    System.out.println("Enter Contact's Email ID:");
                    emailId = sEmail.nextLine();
                    contactEmailID.add(emailId);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Do you want to add more mail IDs?\n1.Yes\n2.No");
            moreEmailInput = sMoreEInput.nextShort();
        }

        //TAKING ADDRESS
        Scanner sAddress= new Scanner(System.in);
        System.out.println("Enter contact's address based on the fields: ");
        System.out.print("Enter Your Door Number: ");
        String doorNum = sAddress.nextLine();
        System.out.print("Enter Your Building Name: ");
        String bldgName = sAddress.nextLine();
        System.out.print("Enter Your StreetName: ");
        String streetName = sAddress.nextLine();
        System.out.print("Enter Your City and Country: ");
        String cityCountry = sAddress.nextLine();

        address.put("addr1", doorNum);
        address.put("addr2", bldgName);
        address.put("addr3", streetName);
        address.put("addr4", cityCountry);

        //TAKING NOTES
        Scanner sNotes= new Scanner(System.in);
        System.out.print("Enter any notes for the contact:");
        notes = sNotes.nextLine();

        if (validateName(contactName)==false) System.exit(1);
        if (validateNumber(contactNumber)==false) System.exit(1);
        if (validateEmail(contactEmailID)==false)System.exit(1);

        arr.add(new ContactFormat(contactName,contactNumber,contactEmailID,address,notes));
    }

    public void displayContact(ArrayList<ContactFormat> arr){

        if (arr.isEmpty()==true){
            System.out.println("No Contacts Found!!!!");
            return;
        }

        System.out.println(arr);

        for (ContactFormat c:
                arr) {
            System.out.println("Contact Name: " + c.contactName); // printing Name
            short i=0;
            for (long num:
                    c.contactNumber) {
                i++;
                System.out.println("Contact Number "+ i + ": " + num); //Printing the phone numbers
            }
            for (String email:
                    c.emailID) {
                i++;
                System.out.println("Contact Email ID "+ i + ": " + email); //printing the email ids
            }
            System.out.print("Contact Address:");
            for (int j=1;j<=4; j++) {
                System.out.print(c.address.get("addr"+j + " ")); //printing the address lines
            }
            System.out.println("Notes: " + c.notes); // printing the notes
        }



    }




    public static void main (String[]args){

        ArrayList<ContactFormat> store= new ArrayList<ContactFormat>();
        ContactListClass cls = new ContactListClass();
        Scanner sn = new Scanner(System.in);
        String displayText = "ContactList\n1.Create Contact\n2.Edit Contact\n3.Delete Contact\n4.Display Contact\n5.Exit\nEnter Your Option:";
        short input;
        System.out.println(displayText);
        input = sn.nextShort();

        while (input != 5) {
            switch (input) {
                case 1:
                    cls.createContact(store);
                    break;

                case 2:
                    break;
                case 3:
                    break;

                case 4:
                    System.out.println("Displaying Contacts:");
                    cls.displayContact(store);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input please enter a valid input.");

            }
            System.out.println(displayText);
            input = sn.nextShort();
        }


    }
}

