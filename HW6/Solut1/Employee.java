// Базовое задние:
// 1) Переписать код в соответствии с Single Responsibility Principle:
// public class Employee {
// private String name;
// private Date dob;
// private int baseSalary;
// public Employee(String name, Date dob, int baseSalary) {
// this.name = name;
// this.dob = dob;
// this.baseSalary = baseSalary;
// }
// public String getEmpInfo() {
// return "name - " + name + " , dob - " + dob.toString();
// }
// public int calculateNetSalary() {
// int tax = (int) (baseSalary * 0.25);//calculate in otherway
// return baseSalary - tax;
// }
// }
// ​
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс


package HW6.Solut1;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // Other methods related to Employee...

    public int calculateNetSalary() {
        SalaryCalculator calculator = new SalaryCalculator();
        return calculator.calculateNetSalary(baseSalary);
    }
}