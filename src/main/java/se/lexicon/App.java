package se.lexicon;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

    CalculatorInterface calculatorInterface01 = new CalculatorInterface();


    double result = calculatorInterface01.calculate(Calculator.scanFirstNumber(), Calculator.scanOperator(), Calculator.scanSecondNumber());
    System.out.println("The result of your calculation is: " + result);



    }
}
