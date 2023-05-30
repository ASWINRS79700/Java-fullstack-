package in.stackroute.ust.service;

import in.stackroute.ust.domain.Contact;
import in.stackroute.ust.exceptions.DuplicateContactException;
import in.stackroute.ust.exceptions.InvalidContactException;

import java.util.List;
import java.util.Optional;

public class ContactServiceImpl implements ContactService {

    private List<Contact> contacts;

    public ContactServiceImpl(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public void addContact(Contact contact) throws InvalidContactException, DuplicateContactException {
        if (contact == null) {
            throw new InvalidContactException("Contact cannot be null.");
        }
//        searchContact(contact.getFirstName(), contact.getLastName())
//                .ifPresent(c -> {
//                    throw new DuplicateContactException("Contact already exists.");
//                });
        Optional<Contact> contactOptional = searchContact(contact.getFirstName(), contact.getLastName());
        if (contactOptional.isPresent()) {
            throw new DuplicateContactException("Contact already exists.");
        }
        contacts.add(contact);

    }

    @Override
    public void deleteContact(String firstName, String lastName) {

    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public Optional<Contact> searchContact(String firstName, String lastName) {
        return contacts.stream()
                .filter(c -> c.getFirstName().equals(firstName) && c.getLastName().equals(lastName))
                .findFirst();
    }

    @Override
    public void displayContact(SortOption sortOption) {
        if (sortOption == SortOption.FIRST_NAME){
            contacts.stream().sorted((c1, c2) -> c1.getFirstName().compareTo(c2.getFirstName()))
                    .forEach(c -> System.out.println(c));
        }
        if (sortOption == SortOption.LAST_NAME){
            contacts.stream().sorted((c1, c2) -> c1.getLastName().compareTo(c2.getLastName()))
                    .forEach(c -> System.out.println(c));
        }
        if (sortOption == SortOption.PHONE_NUMBER){
            contacts.stream().sorted((c1, c2) -> c1.getPhoneNumber().compareTo(c2.getPhoneNumber()))
                    .forEach(c -> System.out.println(c));
        }
    }
}
