package Epam.Algorithmization.Part2_2;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

// Sort Matrix in ascending and descending order row-wise.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex12 {

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

    static void sortRowsInAscendingOrder(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int k = 0; k < matrix[0].length - j - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    static void sortRowsInDescendingOrder(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                for (int k = 0; k < matrix[0].length - j - 1; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
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

            System.out.println("\nRows in your matrix in Ascending order:");
            sortRowsInAscendingOrder(matrix);
            printMatrix(matrix, numOfRows, numOfColumns);

            System.out.println("\nRows in your matrix in Descending order:");
            sortRowsInDescendingOrder(matrix);
            printMatrix(matrix, numOfRows, numOfColumns);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
