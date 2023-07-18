package models;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем по сочетанию имени и фамилии
        int nameComparison = student1.getName().compareTo(student2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return student1.getSurname().compareTo(student2.getSurname());
    }
}