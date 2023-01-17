package exercises.arrays;

import java.util.Random;

/*
 * Generate and print a 4x4 M matrix with random values ​​between 0-9.
 */

public class Ex4_MultidimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){ //Line
            for(int j = 0; j < M[i].length; j++){ //Column
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matrix: ");
        for (int[] line : M) {
            for (int columnElement : line) {
                System.out.print(columnElement + " ");
            }
            System.out.println();
        }

    }
}
