package Epam.Algorithmization.Part2_2;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

Find the maximum elements of the matrix and replace all odd elements with it.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex15 {

    static void printMatrix(int matrix[][], int numOfRows, int numOfColumns) {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }

    static void randomizeMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 + (int) (Math.random() * 89); // [10-99]
            }
        }
    }

    public static int findMAx(int matrix[][], int numOfRows, int numOfColumns) {
        int max = matrix[0][0];
        for (int i = 0; i < numOfRows; ++i) {
            for (int j = 0; j < numOfColumns; ++j) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        return max;
    }

    public static void changeMatrixWithMaxElement(int matrix[][], int numOfRows, int numOfColumns, int max) {
        for (int i = 0; i < numOfRows; ++i) {
            for (int j = 0; j < numOfColumns; ++j) {
                if (Math.abs(matrix[i][j]) % 2 == 1)
                    matrix[i][j] = max;
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

            System.out.println("Your randomized matrix:");
            int matrix[][] = new int[numOfRows][numOfColumns];
            randomizeMatrix(matrix);
            printMatrix(matrix, numOfRows, numOfColumns);

            int max = findMAx(matrix, numOfRows, numOfColumns);
            System.out.println("\nMax element = " + max);

            System.out.println("\nYour matrix with replaced odd numbers into max. element: ");
            changeMatrixWithMaxElement(matrix, numOfRows, numOfColumns, max);
            printMatrix(matrix, numOfRows, numOfColumns);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
