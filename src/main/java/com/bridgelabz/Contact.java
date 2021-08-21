package com.bridgelabz;

/**
 *  Contact Class
 */
public class Contact {
    /**
     *    Declaring variables
     */
    public final String firstname, lastname, address, city, state, email;
    public final int zip, phoneNumber;

    /**
     *
     * @param firstname
     * @param lastname
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phoneNumber
     * @param email
     */
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

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public int getZip() {
        return zip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *  Override toString() Method
     * @return
     */

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
