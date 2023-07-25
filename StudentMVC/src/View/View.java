package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView {

    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("------список студентов--------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("------список всех студентов--------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ID студента, которого нужно удалить: ");
        try {
            return Long.parseLong(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный формат ID студента.");
            return null;
        }
    }

    @Override
    public void displayStudents(List<Student> students) {
        System.out.println("------список студентов--------");
        for (Student stud : students) {
            System.out.println("ID: " + stud.getId() + ", Имя: " + stud.getName() + ", Возраст: " + stud.getAge());
        }
        System.out.println("===============================");
    }

    @Override
    public Student readStudent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = in.nextLine();
        System.out.print("Введите возраст студента: ");
        int age = Integer.parseInt(in.nextLine());
        System.out.print("Введите ID студента: ");
        int id = Integer.parseInt(in.nextLine());
        return new Student(name, age, id);
    }

    @Override
    public Long getStudentIdToUpdate() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ID студента, которого нужно обновить: ");
        try {
            return Long.parseLong(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный формат ID студента.");
            return null;
        }
    }
}