package exercises.loops;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

/*
 * Write a program that calculates the factorial of a user-supplied integer.
 * Ex.: 5! = 120 (5 X 4 X 3 X 2 X 1)
 */

public class Ex6_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Factorial: ");
        int factorial = scan.nextInt();

        int multiplication = 1;

        System.out.print(factorial +"! = ");
        for(int i = factorial; i > 0; i--){
            multiplication *= i;
        }

        System.out.println(multiplication);

    }
}
