package se.lexicon;

import java.util.Scanner;

public interface Calculator {

    double addition(double num1, double num2);

    double subtraction(double num1, double num2);

    double multiplication(double num1, double num2);

    double division(double num1, double num2);

    default double calculate(double num1, char operator, double num2) {
        double result = 0;
        switch (operator) {
            case '+':
                result = addition(num1, num2);
                break;
            case '-':
                result = subtraction(num1, num2);
                break;
            case '*':
                result = multiplication(num1, num2);
                break;
            case '/':
                result = division(num1, num2);
                break;
            default:
                System.out.println(operator + " is not supported.");
        }
        //System.out.println("The result of your calculation is: ");

        return result;
    }

    Scanner scanner = new Scanner(System.in);

    static double scanFirstNumber(){
        System.out.println("Please enter your first number, and hit enter.");
        double num1 = scanner.nextDouble();
        return num1;
    }

    static char scanOperator(){
        System.out.println("Please choose your operator: +, -, *, or /, and hit enter.");
        char operator = scanner.next().charAt(0);
        return operator;
    }

    static double scanSecondNumber(){
        System.out.println("Please enter your second number, and hit enter.");
        double num2 = scanner.nextDouble();
        return num2;
    }

}
