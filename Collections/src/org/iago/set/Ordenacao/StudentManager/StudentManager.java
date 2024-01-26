package org.iago.set.Ordenacao.StudentManager;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.setStudent("Iago", 1, 7.5);
        studentManager.setStudent("José", 2, 7.0);
        studentManager.setStudent("Carlos", 3, 8.1);
        studentManager.setStudent("Marlon", 4, 2.5);
        studentManager.setStudent("Matheus", 5, 9.5);

        studentManager.showStudents();
        System.out.println();
        studentManager.showStudentsByName();
        System.out.println();
        studentManager.showStudentsByScore();

        studentManager.removeStudent(2);
        studentManager.showStudents();
    }

    Set<Student> studentManager;

    public StudentManager(){
        studentManager = new HashSet<>();
    }

    public void setStudent(String name, long registration, double score){
        studentManager.add(new Student(name, registration, score));
    }

    public void removeStudent(long registration){
        if(!studentManager.isEmpty()){
            boolean studentIsRemoved = studentManager.removeIf(student1 -> student1.getRegistration() == registration);
            if (studentIsRemoved){
                System.out.println("Student with registration " + registration +" is removed!");
            } else {
                System.out.println("There isn't student with resgistratio " +registration + " in this manager!");
            }
        } else {
            System.out.println("There aren't students in this manager!");
        }
    }

    public void showStudentsByName(){
        if (!studentManager.isEmpty()){
            Set<Student> studentsByName = new TreeSet<>(studentManager);
            System.out.println(studentsByName);
        } else {
            System.out.println("There aren't students in this manager!");
        }
    }

    public void showStudentsByScore(){
        if (!studentManager.isEmpty()){
            Set<Student> studentsByScore = new TreeSet<>(new ComparatorByScore());
            studentsByScore.addAll(studentManager);
            System.out.println(studentsByScore);
        } else {
            System.out.println("There aren't students in this manager!");
        }

    }

    public void showStudents(){
        if(!studentManager.isEmpty()){
            System.out.println(studentManager);
        } else {
            System.out.println("There aren't students in this manager!");
        }
    }
}
