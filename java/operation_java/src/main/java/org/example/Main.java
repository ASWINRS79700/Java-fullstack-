package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Contact ob1=new Contact("Aswin","R S","9633543054");
        Contact ob2=new Contact("Joveal","Johnson","9400542686");
        Contact ob3=new Contact("Sayan","Jacob","9898989898");
        ContactManager cm=new ContactManager();
        cm.addContact(ob1);
        cm.addContact(ob2);
        cm.addContact(ob3);


    }
}