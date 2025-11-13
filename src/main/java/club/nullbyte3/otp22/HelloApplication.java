package club.nullbyte3.otp22;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Logger;

public class HelloApplication {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(HelloApplication.class.getName());
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        log.info("Enter first number: ");
        double firstNumber = sc.nextDouble();
        log.info("Enter second number: ");
        double secondNumber = sc.nextDouble();
        log.info(String.format("Addition: %d", addValues((int) firstNumber, (int) secondNumber)));
        log.info(String.format("Subtraction: %.2f", subtractValues(firstNumber, secondNumber)));
        log.info(String.format("Multiplication: %.2f", multiplyValues(firstNumber, secondNumber)));
        log.info(String.format("Division: %.2f", divideValues(firstNumber, secondNumber)));
        sc.close();
    }

    public static double multiplyValues(double x, double y) {
        return x * y;
    }

    public static double divideValues(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return x / y;
    }

    public static double subtractValues(double x, double y) {
        return x - y;
    }

    public static int addValues(int a, int b) {
        return a + b;
    }

}