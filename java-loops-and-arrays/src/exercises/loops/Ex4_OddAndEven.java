package exercises.loops;

import java.util.Scanner;

/*
 * Create a program which asks for n integers,
 * Calculate and show the number of even numbers
 * And the number of odd numbers.
 */

public class Ex4_OddAndEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amountNumber;

        System.out.println("Amount of numbers: ");
        amountNumber = scan.nextInt();

        int count = 0;
        int number = 0;
        int numOdd = 0, numEven = 0;

        do {
            System.out.println("Number: ");
            number = scan.nextInt();
            
            if((number % 2) == 0) numOdd++;
            else numEven++;

            count++;
        } while(count < amountNumber);

        System.out.println("Number of Odds: " + numOdd);
        System.out.println("Number of Evens: " + numEven);

    }
}
