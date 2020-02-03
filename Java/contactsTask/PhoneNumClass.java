package com.example.contactsTask;

public class PhoneNumClass<E extends Number, F extends Number> {

     E Phone1;
     F Phone2;

    public E getPhone1() {
        return Phone1;
    }

    public void setPhone1(E phone1) {
        Phone1 = phone1;
    }

    public F getPhone2() {
        return Phone2;
    }

    public void setPhone2(F phone2) {
        Phone2 = phone2;
    }
}
