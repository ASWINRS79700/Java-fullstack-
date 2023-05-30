package org.example;

public class Contact {
    private String firstName,lastName,PhoneNumber;
    Contact(String firstName,String lastName,String PhoneNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(PhoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
}
