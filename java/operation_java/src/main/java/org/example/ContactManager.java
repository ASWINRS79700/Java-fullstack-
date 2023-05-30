package org.example;

import java.util.*;

public class ContactManager implements ContactService{
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        if (!Validator.validate(contact)) {
            System.out.println("Invalid input:");
            return;
        }
        contacts.add(contact);
    }

    public void deleteContact(String firstName, String lastName) {
        contacts.remove(searchContact(firstName, lastName));
    }



    public void updateContact(Contact contact) {
        for (Contact ob : contacts) {
            if(ob==contact){
                Scanner scn=new Scanner(System.in);
                String str=scn.next();
                String st1=scn.next();
                String st2=scn.next();
                ob.setFirstName(str);
                ob.setLastName(st1);
                ob.setPhoneNumber(st2);
            }
        }
    }



    public Contact searchContact(String firstName, String lastName) {
        for (Contact ob : contacts) {
            if (Objects.equals(ob.getFirstName(), firstName) && Objects.equals(ob.getLastName(), lastName)) {
                return ob;
            }
        }
        return null;
    }



    public void displayContact(SortOption sortOption) {
        if(sortOption == SortOption.sortbyfirst){


                FirstName comparator=new FirstName();
                Collections.sort(contacts,comparator);


        } else if (sortOption==SortOption.sortbylast) {
            LastName comparator=new LastName();
            Collections.sort(contacts,comparator);
        }
        else if (sortOption==SortOption.sortbynumber) {
            Num comparator=new Num();
            Collections.sort(contacts,comparator);
        }
        print();

    }



    public void print() {
        for (Contact ob:contacts
             ) {
            System.out.println(ob.getFirstName());
            System.out.println(ob.getLastName());
            System.out.println(ob.getPhoneNumber());
        }
    }
    class FirstName implements Comparator<Contact>{
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
    class LastName implements Comparator<Contact>{
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
    class Num implements Comparator<Contact>{
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
        }
    }

}
