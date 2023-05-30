package in.stackroute.ust.service;

import in.stackroute.ust.domain.Contact;
import in.stackroute.ust.exceptions.ContactNotFoundException;
import in.stackroute.ust.exceptions.DuplicateContactException;
import in.stackroute.ust.exceptions.InvalidContactException;

import java.util.Optional;

public interface ContactService {

    void addContact(Contact contact) throws InvalidContactException, DuplicateContactException;

    void deleteContact(String firstName, String lastName) throws ContactNotFoundException;

    void updateContact(Contact contact);

    Optional<Contact> searchContact(String firstName, String lastName) throws ContactNotFoundException;

    void displayContact(SortOption SortOption);

}
