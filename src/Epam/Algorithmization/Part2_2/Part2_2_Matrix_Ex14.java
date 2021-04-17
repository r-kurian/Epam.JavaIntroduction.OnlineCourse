package Epam.Algorithmization.Part2_2;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.

The program creates a random m x n matrix that consists only of zeros and ones.
In each column the number of "1" is equal to the column index.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex14 {

    static void printMatrix(int[][] matrix, int numOfRows, int numOfColumns) {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }

    static void randomizeMatrixWhereOnesAreEqualColumnIndex(int[][] matrix, int numOfRows, int numOfColumns) {
        for (int j = 0; j < Math.min(numOfRows, numOfColumns); ++j) {
            for (int i = 0; i < j + 1; ++i) {
                int index = (int) (Math.random() * (numOfRows));
                while (matrix[index][j] == 1) {
                    index = (int) (Math.random() * (numOfRows));
                }
                matrix[index][j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int numOfRows, numOfColumns;

            do {
                System.out.println("Enter positive integers \"n\" and \"m\", the size of the matrix. " +
                        "\nAttention!, n >= m: ");
                numOfRows = sc.nextInt();
                numOfColumns = sc.nextInt();
            } while (numOfColumns <= 0 || numOfRows < numOfColumns);


            System.out.println("\nYour randomized matrix, where the number of \"1\" is equal to the column index:");
            int[][] matrix = new int[numOfRows][numOfColumns];
            randomizeMatrixWhereOnesAreEqualColumnIndex(matrix, numOfRows, numOfColumns);
            printMatrix(matrix, numOfRows, numOfColumns);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
