package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    protected List<Student> students = new ArrayList<>();

    // Методы добавления студентов
    public void addStudent(Student student) {
        students.add(student);
    }

    private class StudyGroupIterator implements Iterator<Student> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < students.size();
        }

        @Override
        public Student next() {
            return students.get(currentIndex++);
        }

        @Override
        public void remove() {
            students.remove(currentIndex - 1);
            currentIndex--;
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator();
    }

    // Добавим метод для получения списка студентов
    public List<Student> getStudents() {
        return students;
    }
}