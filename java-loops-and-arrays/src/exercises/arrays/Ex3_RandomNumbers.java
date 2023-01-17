package exercises.arrays;

import java.util.Random;

/*
 * Write a program that reads 20 random integers (between 0 and 100) and stores them in a vector.
 * At the end, show the numbers and their successors.
 */

public class Ex3_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for(int i = 0; i < randomNumbers.length; i++){
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.print("Random numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nRandom numbers successors: ");
        for (int number : randomNumbers) {
            System.out.print((number + 1) + " ");
        }

    }
}
