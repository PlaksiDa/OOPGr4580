package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;
import View.View;

public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students) {
        return !students.isEmpty();
    }

    public void update() {
        students = model.getAllStudents();
        if (testData(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Enter command:");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    List<Student> students = model.getAllStudents();
                    if (!students.isEmpty()) {
                        view.printAllStudents(students);
                    } else {
                        System.out.println("No students in the list.");
                    }
                    break;
                case CREATE:
                    Student newStudent = view.readStudent();
                    model.addStudent(newStudent);
                    System.out.println("New student has been added.");
                    break;
                case DELETE:
                    Long idToDelete = view.getStudentIdToDelete();
                    if (idToDelete != null) {
                        model.deleteStudentById(idToDelete);
                        System.out.println("Student with ID " + idToDelete + " has been deleted.");
                    } else {
                        System.out.println("Student with the specified ID does not exist.");
                    }
                    break;
            }
        }
    }
}