package exercises.arrays;

import java.util.Scanner;

/*
 * Create a vector of 6 integers 
 * and print them in reverse order
 */

public class Ex1_ReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vector = {4, -2, 16, 70, 10, 40};

        System.out.println(vector.length);// Return 6
        
        System.out.print("Vector ");
        int count = 0;
        while(count <= (vector.length - 1)){
            System.out.print(vector[count] + " ");
            count++;
        }

        for(int i = (vector.length - 1); i >= 0; i--){
            System.out.print(vector[i] + " ");
        }

    }
}
