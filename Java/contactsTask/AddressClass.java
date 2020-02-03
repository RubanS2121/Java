package com.example.contactsTask;

public class AddressClass<W extends String, X extends String, Y extends String, Z extends String> {

    W Address;
    X City;
    Z Country;
    Y Postal;

    public W getAddress() {

        return Address;
    }

    public void setAddress(W address) {
        Address = address;
    }

    public X getCity() {
        return City;
    }

    public void setCity(X city) {
        City = city;
    }

    public Z getCountry() {
        return Country;
    }

    public void setCountry(Z country) {
        Country = country;
    }

    public Y getPostal() {
        return Postal;
    }

    public void setPostal(Y postal) {
        Postal = postal;
    }
}
