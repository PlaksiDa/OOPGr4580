import operations.*;

public class App {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 4);

        ComplexOperation addition = new Addition();
        ComplexOperation multiplication = new Multiplication();
        ComplexOperation division = new Division();

        // Выполнение операций с использованием калькулятора с логированием
        ComplexNumber additionResult = num1.calculate(num1, num2, addition);
        ComplexNumber multiplicationResult = num1.calculate(num1, num2, multiplication);
        ComplexNumber divisionResult = num1.calculate(num1, num2, division);

        // Вывод результатов
        System.out.println("Результат сложения: " + additionResult);
        System.out.println("Результат умножения: " + multiplicationResult);
        System.out.println("Результат деления: " + divisionResult);
    }
}