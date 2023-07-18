import models.*;
import services.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Создаем объекты студентов
        Student student1 = new Student("John", "Doe", 101);
        Student student2 = new Student("Alice", "Smith", 102);
        Student student3 = new Student("Bob", "Johnson", 103);

        // Создаем объект группы и добавляем студентов
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.addStudent(student1);
        studyGroup.addStudent(student2);
        studyGroup.addStudent(student3);

        // Создаем объект сервиса и передаем группу
        StudyGroupService studyGroupService = new StudyGroupService(studyGroup);

        // Выводим список студентов перед сортировкой
        System.out.println("Список студентов до сортировки:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " (ID: " + student.getStudentId() + ")");
        }

        // Удаляем студента по имени
        studyGroupService.removeStudentByName("Alice");

        // Выводим список студентов после удаления
        System.out.println("\nСписок студентов после удаления:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " (ID: " + student.getStudentId() + ")");
        }

        // Сортируем студентов по ID
        studyGroupService.sortStudentsById();

        // Выводим список студентов после сортировки по ID
        System.out.println("\nСписок студентов после сортировки по ID:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " (ID: " + student.getStudentId() + ")");
        }

        // Сортируем студентов по ФИО с использованием StudentComparator
        studyGroupService.sortStudentsWithComparator(new StudentComparator());

        // Выводим список студентов после сортировки по ФИО
        System.out.println("\nСписок студентов после сортировки по ФИО:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " (ID: " + student.getStudentId() + ")");
        }

        // Создаем объекты потоков
        StudyStream stream1 = new StudyStream();
        StudyStream stream2 = new StudyStream();

        // Добавляем группы в потоки
        stream1.addStudyGroup(studyGroup);
        stream2.addStudyGroup(studyGroup);
        stream2.addStudyGroup(studyGroup);

        // Создаем объект сервиса для работы с потоками
        StudyStreamService studyStreamService = new StudyStreamService();

        // Создаем список потоков и добавляем в него созданные потоки
        List<StudyStream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        // Выводим список потоков перед сортировкой
        System.out.println("\nСписок потоков до сортировки:");
        for (StudyStream stream : streams) {
            System.out.println("Количество групп: " + stream.getStudyGroups().size());
        }

        // Сортируем потоки по количеству групп
        studyStreamService.sortStreams(streams);

        // Выводим список потоков после сортировки
        System.out.println("\nСписок потоков после сортировки:");
        for (StudyStream stream : streams) {
            System.out.println("Количество групп: " + stream.getStudyGroups().size());
        }
    }
}