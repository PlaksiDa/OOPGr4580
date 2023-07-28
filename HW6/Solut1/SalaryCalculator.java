package HW6.Solut1;

public class SalaryCalculator {
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25); // calculate in other way
        return baseSalary - tax;
    }
}