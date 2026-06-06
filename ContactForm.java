package com.example.portfolio;

public class ContactForm {

    private String name;
    private String email;
    private String message;

    // Default constructor
    public ContactForm() {
    }

    // Parameterized constructor (optional but useful)
    public ContactForm(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ContactForm{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}