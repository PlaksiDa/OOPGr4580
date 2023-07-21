package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;

public class StudentService implements iPersonService<Student> {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, int age) {
        Student student = new Student(firstName, age, students.size() + 1);
        students.add(student);
    }

    public void sortStudentsByNameAndAge() {
        students.sort(new PersonComparator<Student>());
    }
}