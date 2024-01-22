package org.iago.list.Ordenacao.PeopleOrdenation;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height){
        setName(name);
        setAge(age);
        setWeigth(height);
    }

    // Setters
    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setWeigth(double weigth) {
        this.height = weigth;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeigth() {
        return height;
    }

    @Override
    public String toString() {
        return "Person " + name + " has " + age + " years and " + height + " centimeter";
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(person.getAge(), age);
    }
}
