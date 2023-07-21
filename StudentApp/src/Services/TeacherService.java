package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher teacher = new Teacher(firstName, age, "Unknown");
        teachers.add(teacher);
    }

    public void sortTeachersByNameAndAge() {
        teachers.sort(new PersonComparator<Teacher>());
    }
}