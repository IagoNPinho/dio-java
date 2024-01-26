package org.iago.set.Search.Contacts;

import java.util.Objects;

public class Contact {
  private String name;
  private int number;

  public Contact(String name, int number){
    setName(name);
    setNumber(number);
  }

  private void setName(String newName){
    this.name = newName;
  }

  public void setNumber(int newNumber){
    this.number = newNumber;
  }

  public String getName(){
    return this.name;
  }

  public int getNumber(){
    return this.number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Contact contact = (Contact) o;
    return Objects.equals(name, contact.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public String toString(){
    return "Contact " + name + " and " + number;
  }
}