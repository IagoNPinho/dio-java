package org.iago.list.Ordenacao.PeopleOrdenation;

import java.util.Comparator;

public class ComparatorPersonByHeight implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person2.getWeigth(), person1.getWeigth());
    }
}
