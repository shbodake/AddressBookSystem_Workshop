package com.blp.workshop;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Contacts contact = new Contacts("Sayali", "Bodake", "Sai Paradise Apartment", "Nashik", "Maharashtra", 422003, "9850521236", "sayalibodake28@gmail.com");
        System.out.println(contact);
    }

}
