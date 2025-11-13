package club.nullbyte3.otp22;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Logger;

public class HelloApplication {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(HelloApplication.class.getName());
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        log.info("Enter first number: ");
        int firstNumber = sc.nextInt();
        log.info("Enter second number: ");
        int secondNumber = sc.nextInt();
        log.info("The sum is: " + addValues(firstNumber, secondNumber));
    }

    public static int addValues(int a, int b) {
        return a + b;
    }

}