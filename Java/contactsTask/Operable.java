package com.example.contactsTask;

import java.io.IOException;

public interface Operable {

    public void createContacts()throws IOException;
    public void deleteContact()throws IOException;
    public void displayContacts();
    public void editContact();

}
