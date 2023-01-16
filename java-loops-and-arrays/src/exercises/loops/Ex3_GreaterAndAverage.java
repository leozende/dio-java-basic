package exercises.loops;

import java.util.Scanner;

/*
 * Create a program that read 5 numbers
 * and report the greater number
 * and the average of those numbers.
 */

public class Ex3_GreaterAndAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int greaterNum = 0;
        int sum = 0;

        int count = 0;
        
        do{
            System.out.println("Number: ");
            number = scan.nextInt();

            sum += number;

            if (number > greaterNum) greaterNum = number;

            count++;
        }while(count < 5);

        System.out.println("Greater number: " + greaterNum);
        System.out.println("Sum of all the numbers: " + sum);
        System.out.println("Average of the numbers: " + (sum/count));

    }
}
