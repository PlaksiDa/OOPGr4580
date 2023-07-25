package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {

    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("------List of Students--------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("------List of All Students--------");
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
        System.out.print("Enter the ID of the student you want to delete: ");
        try {
            return Long.parseLong(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Incorrect format for student ID.");
            return null;
        }
    }

    @Override
    public void displayStudents(List<Student> students) {
        System.out.println("------List of Students--------");
        for (Student stud : students) {
            System.out.println("ID: " + stud.getId() + ", Name: " + stud.getName() + ", Age: " + stud.getAge());
        }
        System.out.println("===============================");
    }

    @Override
    public Student readStudent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String name = in.nextLine();
        System.out.print("Enter the student's age: ");
        int age = Integer.parseInt(in.nextLine());
        System.out.print("Enter the student's ID: ");
        int id = Integer.parseInt(in.nextLine());
        return new Student(name, age, id);
    }

    @Override
    public Long getStudentIdToUpdate() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the ID of the student you want to update: ");
        try {
            return Long.parseLong(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Incorrect format for student ID.");
            return null;
        }
    }
}