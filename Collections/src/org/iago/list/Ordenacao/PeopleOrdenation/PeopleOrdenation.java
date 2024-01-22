package org.iago.list.Ordenacao.PeopleOrdenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleOrdenation {
    public static void main(String[] args) {
        PeopleOrdenation peopleOrdenation = new PeopleOrdenation();

        peopleOrdenation.setPerson("Iago Pinho", 21, 163.5);
        peopleOrdenation.setPerson("Elizabeth Carvalho", 18, 148);
        peopleOrdenation.setPerson("Ana Camila", 38, 149);
        peopleOrdenation.setPerson("Marcio Pinho", 46, 165);

        System.out.println("List of people by age: ");
        for(Person person: peopleOrdenation.getOrdenedPersonListByAge()){
            System.out.println(person);
        }
        System.out.println("\nList of people by Height: ");
        for(Person person: peopleOrdenation.getOrdenedPersonListByHeight()){
            System.out.println(person);
        }

    }

    private final List<Person> personList;

    public PeopleOrdenation(){
        personList = new ArrayList<>();
    }

    public void setPerson(String name, int age, double height){
        personList.add(new Person(name, age, height));
    }

    // Ordened using compareTo of Comparable
    public List<Person> getOrdenedPersonListByAge(){
        List<Person> personListByAge = new ArrayList<>(personList);
        Collections.sort(personListByAge);
        return personListByAge;
    }

    // Ordened using compare of Comparator
    public List<Person> getOrdenedPersonListByHeight(){
        List<Person> personListByHeight = new ArrayList<>(personList);
        personListByHeight.sort(new ComparatorPersonByHeight());
        return personListByHeight;
    }

}
