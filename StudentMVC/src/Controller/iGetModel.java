package Controller;

import java.util.List;
import Model.Student;

public interface iGetModel {
    List<Student> getAllStudents();
    void addStudent(Student student);
    void updateStudent(Student student);
    boolean deleteStudentById(Long studentId);
    Student getStudentById(Long id);
}