package operations;

import logger.LoggingCalculator;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Метод для выполнения операции с комплексными числами
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, ComplexOperation operation) {
        ComplexOperation calculator = new LoggingCalculator(operation); // Создаем калькулятор с логированием операций
        return calculator.operate(a, b); // Выполняем операцию с использованием калькулятора с логированием
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}