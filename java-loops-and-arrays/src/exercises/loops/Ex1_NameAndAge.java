package exercises.loops;

import java.util.Scanner;

/*
 * Write a program that reads sets of two values,
 * The first represents the name of the student and the second represents your age.
 * (Stop the program inserting the value 0 in the name field)
 */

public class Ex1_NameAndAge {
    public static void main(String[] args) throws Exception {
        Scanner scan  = new Scanner(System.in);

        String name;
        int age;

        while(true) {
            System.out.println("Name: ");
            name = scan.next();
            if (name.equals("0")) break;
    
            System.out.println("Age: ");
            age = scan.nextInt();
    
            System.out.println("Your name is " + name + " and your age is " + age);
        }

        System.out.println("Continue here...");


    }
}
