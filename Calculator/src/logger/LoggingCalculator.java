package logger;

import operations.*;

public class LoggingCalculator implements ComplexOperation {
    private ComplexOperation calculator;
    private Logger logger;

    public LoggingCalculator(ComplexOperation calculator) {
        this.calculator = calculator; // Оборачиваем обычный калькулятор в декоратор
        this.logger = new Logger();
    }

    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.operate(a, b); // Выполняем операцию с использованием обычного калькулятора
        logger.log("Операция: " + a + " + " + b + " = " + result); // Логируем операцию и результат
        return result;
    }
}