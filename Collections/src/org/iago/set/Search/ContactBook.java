package org.iago.set.Search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
  public static void main(String[] args) {
    ContactBook contactBook = new ContactBook();

    contactBook.showContacts();

    contactBook.setContact("Iago", 123456);
    contactBook.setContact("Iago Gamer", 789856);
    contactBook.setContact("José", 127856);
    contactBook.setContact("João", 987123);
    contactBook.setContact("Josefina", 987654);

    contactBook.showContacts();

    contactBook.searchContactsByName("Iago");

    contactBook.putNewNumberContact("Iago GAMER", 896541);

    contactBook.showContacts();
  }
  private Set<Contact> contactBookSet;

  public ContactBook(){
    contactBookSet = new HashSet<>();
  }

  public void setContact(String name, int number){
    contactBookSet.add(new Contact(name, number));
  }

  public Set<Contact> searchContactsByName(String name){
    Set<Contact> contactsByName = new HashSet<>();
    if(!contactsByName.isEmpty()){
      for(Contact contact: contactBookSet){
        if(contact.getName().toLowerCase().startsWith(name.toLowerCase())){
          contactsByName.add(contact);
        }
      }
    } else{
      throw new RuntimeException("This contact's book is empty!");
    }
    return contactsByName;
  }
  
  public Contact putNewNumberContact(String name, int newNumber){
    Contact updatedContact = null;
    if(!contactBookSet.isEmpty()){
      for(Contact contact: contactBookSet){
        if(contact.getName().equalsIgnoreCase(name)){
          contact.setNumber(newNumber);
          updatedContact = contact;
          break;
        }
      }
      if(updatedContact == null){
        throw new RuntimeException("There aren't contacts with this name!");
      }
    } else{
      throw new RuntimeException("This contact's book is empty!");
    }
    return updatedContact;
  }

  public void showContacts(){
    if(!contactBookSet.isEmpty()){
      System.out.println(contactBookSet);
    } else {
      throw new RuntimeException("This contact's book is empty!");
    }
  }
}
