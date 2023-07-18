package services;

import java.util.Iterator;
import models.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;

    public StudyGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public void removeStudentByName(String name) {
        Iterator<Student> iterator = studyGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
                break;
            }
        }
    }

    public void sortStudentsById() {
        List<Student> students = studyGroup.getStudents();
        Collections.sort(students);
    }

    public void sortStudentsByFullName() {
        List<Student> students = studyGroup.getStudents();
        StudentComparator comparator = new StudentComparator();
        Collections.sort(students, comparator);
    }

    // Метод для сортировки студентов с использованием переданного компаратора
    public void sortStudentsWithComparator(Comparator<Student> comparator) {
        List<Student> students = studyGroup.getStudents();
        Collections.sort(students, comparator);
    }
}