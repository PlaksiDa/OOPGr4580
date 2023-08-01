package operations;

public class Addition implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() + b.getReal();
        double imaginaryPart = a.getImaginary() + b.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}