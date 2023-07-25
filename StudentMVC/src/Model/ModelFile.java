package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class ModelFile implements iGetModel {
    private String fileName;

    public ModelFile(String fileName) {
        this.fileName = fileName;

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Student getStudentById(Long id) {
        List<Student> students = loadStudentsFromFile();
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return loadStudentsFromFile();
    }

    @Override
    public void addStudent(Student student) {
        List<Student> students = loadStudentsFromFile();
        students.add(student);
        saveAllStudentToFile(students);
    }

    @Override
    public void updateStudent(Student student) {
        List<Student> students = loadStudentsFromFile();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                break;
            }
        }
        saveAllStudentToFile(students);
    }

    @Override
    public boolean deleteStudentById(Long studentId) {
        List<Student> students = loadStudentsFromFile();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == studentId) {
                students.remove(i);
                saveAllStudentToFile(students);
                return true;
            }
        }
        return false;
    }

    private List<Student> loadStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                String name = param[0];
                int age = Integer.parseInt(param[1]);
                int id = Integer.parseInt(param[2]);
                Student student = new Student(name, age, id);
                students.add(student);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    private void saveAllStudentToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            for (Student student : students) {
                fw.write(student.getName() + " " + student.getAge() + " " + student.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}