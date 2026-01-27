package programing_construct;
import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a & b: Take inputs
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next(); // operator inpu

        double result;

        // Step e & f: switch-case for operations
        switch (op) {
            case "+": 
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-": 
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*": 
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/": 
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;

            default: 
                System.out.println("Invalid Operator");
        }
    }
}
