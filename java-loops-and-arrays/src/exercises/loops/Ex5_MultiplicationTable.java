package exercises.loops;

import java.util.Scanner;

/*
 * Develop a multiplication table,
 * capable of generating the multiplication table of any integer between 1 and 10.
 * The user must inform which number he wants to see the multiplication table.
 * The output should look like the example below:
 * 
 * Multiplication table of 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */

public class Ex5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Multiplication table: ");
        int multiTable = scan.nextInt();

        System.out.println("Multiplication table of " + multiTable);

        for(int i = 1; i <= 10; i++){
            System.out.println(multiTable + " X " + i + " = " + (multiTable * i));
        }

    }
}
