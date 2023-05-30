package in.stackroute.ust.service;

import in.stackroute.ust.domain.Contact;
import in.stackroute.ust.exceptions.DuplicateContactException;
import in.stackroute.ust.exceptions.InvalidContactException;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

class ContactServiceImplTest {

    private Contact john;
    private Contact jane;

    private ContactService contactService;

    @BeforeEach
    void setUp() {
        john = new Contact("John", "Doe", "1234567890");
        jane = new Contact("Jane", "Doe", "0987654321");
        contactService = new ContactServiceImpl(new ArrayList<>());
    }

    @AfterEach
    void tearDown() {
        john = null;
        jane = null;
    }

    @Test
    void shoudThrowIllegalArgumentExceptionWhenContactPropertiesAreNull() {
        IllegalArgumentException exception = null;

        exception = assertThrows(IllegalArgumentException.class,
                () -> new Contact(null, "Aswin", "1234566"));
        assertEquals("Last name cannot be null or empty.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new Contact("S", null, "1234566"));
        assertEquals("First name cannot be null or empty.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new Contact("null", "John", null));
        assertEquals("Phone number cannot be null or empty.", exception.getMessage());

    }

    @Test
    void shoudThrowIllegalArgumentExceptionWhenContactPropertiesAreEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("", "Aswin", "1234566"));
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("S", "", "1234566"));
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("null", "John", ""));
    }

    @Test
    void shouldThrowInvalidContactExceptionWhenContactIsNull() {
        InvalidContactException exception =
                assertThrows(InvalidContactException.class, () -> contactService.addContact(null));
        assertEquals("Contact cannot be null.", exception.getMessage());
    }

    @Test
    void shouldThrowDuplicateContactExceptionWhenContactAlreadyExists() {
        contactService.addContact(john);
        DuplicateContactException exception =
                assertThrows(DuplicateContactException.class, () -> contactService.addContact(john));
        assertEquals("Contact already exists.", exception.getMessage());
    }

    @Test
    void shouldAddContactWhenContactDoesNotExist() {
        contactService.addContact(john);
        assertTrue(contactService.searchContact(john.getFirstName(), john.getLastName()).isPresent());
    }
}