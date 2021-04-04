package Epam.Algorithmization.Part2_2;


// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

// Sort Matrix in ascending and descending order column-wise.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex13 {

    static void printMatrix(int[][] matrix, int numOfRows, int numOfColumns) {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }

    static void randomizeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 + (int) (Math.random() * 89); // [10-99]
            }
        }
    }

    static void sortColumnsInAscendingOrder(int[][] matrix, int numOfRows, int numOfColumns) {
        for (int j = 0; j < numOfColumns; ++j) {
            for (int i = 0; i < numOfRows - 1; ++i) {
                for (int k = i + 1; k < numOfRows; ++k) {
                    if (matrix[i][j] > matrix[k][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }
    }

    static void sortColumnsInDescendingOrder(int[][] matrix, int numOfRows, int numOfColumns) {
        for (int j = 0; j < numOfColumns; ++j) {
            for (int i = 0; i < numOfRows / 2; ++i) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[numOfRows - i - 1][j];
                matrix[numOfRows - i - 1][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int numOfRows, numOfColumns;

            do {
                System.out.println("Enter positive integers \"n\" and \"m\", the size of the matrix:");
                numOfRows = sc.nextInt();
                numOfColumns = sc.nextInt();
            } while (numOfRows <= 0 || numOfColumns <= 0);

            System.out.println("\nYour randomized matrix:");
            int[][] matrix = new int[numOfRows][numOfColumns];
            randomizeMatrix(matrix);
            printMatrix(matrix, numOfRows, numOfColumns);

            System.out.println("\nColumns in your matrix in Ascending order:");
            sortColumnsInAscendingOrder(matrix, numOfRows, numOfColumns);
            printMatrix(matrix, numOfRows, numOfColumns);

            System.out.println("\nColumns in your matrix in Descending order:");
            sortColumnsInDescendingOrder(matrix, numOfRows, numOfColumns);
            printMatrix(matrix, numOfRows, numOfColumns);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
