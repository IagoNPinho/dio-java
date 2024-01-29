package org.iago.map.OperacoesBasicas.ContactsBook;

import java.util.HashMap;
import java.util.Map;

public class ContactsBook {
    private Map<String, Integer> contactsBook;

    public ContactsBook(){
        this.contactsBook = new HashMap<>();
    }

    public void setContact(String name, Integer contactNumber){
        contactsBook.put(name, contactNumber);
    }

    public void removeContact(String name){
        if(!contactsBook.isEmpty()){
            contactsBook.remove(name);
        } else {
            System.out.println("This map is empty");
        }
    }

    public void showContacts(){
        if (!contactsBook.isEmpty()){
            System.out.println(contactsBook);
        } else {
            System.out.println("This map is empty");
        }
    }

    public Integer getContactNumberByName(String name){
        Integer numberOfContact = null;
        if (!contactsBook.isEmpty()){
            numberOfContact = contactsBook.get(name);
            if (numberOfContact == null){
                System.out.println("There isn't contact with this name!");
            }
        } else {
            System.out.println("This map is empty");
        }
        return numberOfContact;
    }

    public static void main(String[] args) {
        ContactsBook contactsBook = new ContactsBook();

        contactsBook.setContact("Iago", 123456789);
        contactsBook.setContact("Iago Job", 123447852);
        contactsBook.setContact("Iago Brother", 123654987);
        contactsBook.setContact("Iago Father", 963852741);

        contactsBook.showContacts();

        contactsBook.removeContact("Iago");

        contactsBook.showContacts();

        System.out.println("Number of Iago Job is " + contactsBook.getContactNumberByName("Iago Job"));
    }
}
