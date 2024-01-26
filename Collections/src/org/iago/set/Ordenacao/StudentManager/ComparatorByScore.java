package org.iago.set.Ordenacao.StudentManager;

import java.util.Comparator;

public class ComparatorByScore implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getScore(), student2.getScore());
    }
}
