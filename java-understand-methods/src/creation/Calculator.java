package creation;

/**
 * Exercise class 1 about methods.
 */

public class Calculator {

    public static void sum(double number1, double number2) {

        double result = number1 + number2;

        System.out.println("The sum of " + number1 + " plus " + number2 + " is " + result);
    }

    public static void subtraction(double number1, double number2) {

        double result = number1 - number2;

        System.out.println("The subtraction of " + number1 + " minus " + number2 + " is " + result);
    }

    public static void multiplication(double number1, double number2) {

        double result = number1 * number2;

        System.out.println("The multiplication of " + number1 + " times " + number2 + " is " + result);
    }

    public static void division(double number1, double number2) {

        double result = number1 / number2;

        System.out.println("The division of " + number1 + " by " + number2 + " is " + result);
    } 

}
