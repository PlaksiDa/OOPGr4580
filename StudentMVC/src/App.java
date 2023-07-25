import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ModelFile;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Choose language: (1) Russian, (2) English");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        iGetView view;
        if (choice == 2) {
            view = new ViewEng();
        } else {
            view = new View();
        }

        List<Student> students = new ArrayList<Student>();
        
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        ModelFile fModel = new ModelFile("StudentDB.txt");
        iGetModel modelFile = fModel;
        Controller control = new Controller(modelFile, view);

        control.run();
    }
}