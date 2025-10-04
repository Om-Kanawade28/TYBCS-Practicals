// File: Driver.java
import calculator.BasicCalculator; // import the package and class

public class Driver {
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));

        // Test divide by zero
        System.out.println("Division by zero: " + calc.divide(a, 0));
    }
}
