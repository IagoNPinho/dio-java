package org.iago.set.Search;

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
  public boolean equals(Object o){
    if(this == o){
      return true;
    } else if(!(o instanceof Contact contact)){
      return false;
    }
    return Objects.equals(getName(), contact.getName());
  }

  @Override
  public String toString(){
    return "Contact " + name + " and " + number;
  }
}