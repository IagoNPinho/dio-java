package org.iago.set.Ordenacao.StudentManager;

public class Student implements Comparable<Student>{
    private String name;
    private long registration;
    private double score;

    public Student(String name, long registration, double score){
        setName(name);
        setRegistration(registration);
        setScore(score);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setRegistration(long registration) {
        this.registration = registration;
    }

    private void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public long getRegistration() {
        return registration;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareToIgnoreCase(student.getName());
    }

    @Override
    public String toString() {
        return "Student " + name + " with registration " + registration + " do " + score + " points";
    }
}
