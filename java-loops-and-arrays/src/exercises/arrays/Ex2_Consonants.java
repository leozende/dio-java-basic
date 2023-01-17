package exercises.arrays;

import java.util.Scanner;

import javax.print.event.PrintEvent;

/*
 * Make a program that reads a 6-character vector,
 * and writes how many consonants were read.
 * Print the consonants.
 */

public class Ex2_Consonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consonants = new String[6];
        int consonantsAmount = 0;

        int count = 0;
        do{
            System.out.println("Letter: ");
            String letter = scan.next();

            if(   !(letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u"))){
                
                consonants[count] = letter;
                consonantsAmount++;
                
            }

            count++;

        }while(count < consonants.length);

        System.out.println("Consonants: ");
        for (String consonant : consonants) {
            if(consonant != null)
                System.out.print(consonant + " ");
        }
        System.out.println("Amount of consonants: " + consonantsAmount);

    }
}
