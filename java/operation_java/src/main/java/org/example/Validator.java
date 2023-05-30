package org.example;


    public class Validator {
        private Validator() {}

        public static boolean validate(Contact contact) {
            String firstName = contact.getFirstName();
            String lastName = contact.getLastName();
            String phoneNumber = contact.getPhoneNumber();

            // Check first name
            if (firstName == null || firstName.trim().isEmpty() || !firstName.matches("[a-zA-Z]+")) {
                return false;
            }

            // Check last name
            if (lastName == null || lastName.trim().isEmpty() || !lastName.matches("[a-zA-Z]+")) {
                return false;
            }

            // Check phone number
            if (phoneNumber == null || phoneNumber.trim().isEmpty() || !phoneNumber.matches("\\d{10}")) {
                return false;
            }

            return true;
        }
    }
