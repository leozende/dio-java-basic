package exercises.loops;
import java.util.Scanner;

/*
 * Write a program that asks for a grade between zero and ten.
 * Show a message if the value is invalid
 * and continue asking
 * until the user write an invalid valor.
 */

public class Ex2_Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int grade;

        System.out.println("Grade: ");
        grade = scan.nextInt();

        while(grade < 0 | grade > 10) {
            System.out.println("Invalid grade! Write again: ");
            grade = scan.nextInt();
        }
    }
}
