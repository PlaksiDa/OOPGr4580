import Controllers.StudentController;
import Controllers.TeacherController;
import Domen.Student;
import Domen.Teacher;
import Services.AverageAge;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        StudentController studentController = new StudentController();
        studentController.create("John Doe", 20);
        studentController.create("Jane Smith", 22);
        studentController.create("Mike Johnson", 21);

        TeacherController teacherController = new TeacherController();
        teacherController.create("John Doe", 35);
        teacherController.create("Jane Smith", 42);
        teacherController.create("Mike Johnson", 29);

        // Сортировка студентов и учителей
        studentController.sortStudentsByNameAndAge();
        teacherController.sortTeachersByNameAndAge();

        List<Student> students = studentController.getAll();
        List<Teacher> teachers = teacherController.getAll();

        System.out.println("Студенты:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Учителя:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        // Расчёт возраста
        AverageAge<Student> averageAgeStudent = new AverageAge<>();
        double averageStudentAge = averageAgeStudent.calculateAverageAge(students);

        AverageAge<Teacher> averageAgeTeacher = new AverageAge<>();
        double averageTeacherAge = averageAgeTeacher.calculateAverageAge(teachers);

        System.out.println("Средний возраст студентов: " + averageStudentAge);
        System.out.println("Средний возраст учителей: " + averageTeacherAge);
    }
}