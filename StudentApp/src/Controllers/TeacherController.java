package Controllers;

import Domen.Teacher;
import Services.TeacherService;

import java.util.List;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, int age) {
        teacherService.create(firstName, age);
    }

    public void sortTeachersByNameAndAge() {
        teacherService.sortTeachersByNameAndAge();
    }

    public List<Teacher> getAll() {
        return teacherService.getAll();
    }
}