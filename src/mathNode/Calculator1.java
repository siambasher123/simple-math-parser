package mathNode;

public class Calculator1 {

    // Add method
    public double add(double a, double b) {
        return a + b;
    }

    // Subtract method
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiply method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide method
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
