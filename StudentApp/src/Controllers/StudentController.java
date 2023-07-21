package Controllers;

import Domen.Student;
import Services.StudentService;

import java.util.List;

public class StudentController implements iPersonController<Student> {
    private final StudentService studentService = new StudentService();

    @Override
    public void create(String firstName, int age) {
        studentService.create(firstName, age);
    }

    public void sortStudentsByNameAndAge() {
        studentService.sortStudentsByNameAndAge();
    }

    public List<Student> getAll() {
        return studentService.getAll();
    }
}