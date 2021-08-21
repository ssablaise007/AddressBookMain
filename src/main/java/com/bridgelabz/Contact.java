package com.bridgelabz;

/**
 *  Contact Class
 */
public class Contact {

    public final String firstname, lastname, address, city, state, email;
    public final int zip, phoneNumber;

    public Contact(String firstname, String lastname, String address, String city, String state, int zip, int phoneNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void printContactDetails() {
        System.out.println("Firstname : " + firstname);
        System.out.println("Lastname : " + lastname);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Zip : " + zip);
        System.out.println("PhoneNumber : " + phoneNumber);
        System.out.println("Email : " + email);
    }


}
