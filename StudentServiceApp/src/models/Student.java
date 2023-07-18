package models;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int studentId;

    public Student(String name, String surname, int studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.studentId, otherStudent.studentId);
    }
}