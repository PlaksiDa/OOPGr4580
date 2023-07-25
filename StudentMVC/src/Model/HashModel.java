package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class HashModel implements iGetModel {
    private Map<Long, Student> studentsMap = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(studentsMap.values());
    }

    @Override
    public Student getStudentById(Long id) {
        return studentsMap.get(id);
    }

    @Override
    public void addStudent(Student student) {
        studentsMap.put((long) student.getId(), student);
    }

    @Override
    public void updateStudent(Student student) {
        studentsMap.put((long) student.getId(), student);
    }

    @Override
    public boolean deleteStudentById(Long studentId) {
        return studentsMap.remove(studentId) != null;
    }
}