package se.lexicon;

public class CalculatorInterface implements Calculator {

    public double result;
    public double num1;
    public double num2;
    public char operator;

    @Override
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtraction(double num1, double num2){
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2){
        return num1 * num2;
    }

    @Override
    public double division(double num1, double num2){
        return num1 / num2;
    }



}
