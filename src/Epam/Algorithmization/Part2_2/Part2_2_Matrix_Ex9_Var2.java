package Epam.Algorithmization.Part2_2;

import java.util.Scanner;

public class Part2_2_Matrix_Ex9_Var2 {

// https://www.javatpoint.com/program-to-find-the-sum-of-each-row-and-each-column-of-a-matrix

    public static void printMatrix(int[][] matrix, int numOfRow, int numOfColumns) {
        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfColumns; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }

    public static void randomizeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 + (int) (Math.random() * 89); // [10-99]
            }
        }
    }

    public static void findSumOfEachColumns(int numOfRow, int numOfColumns, int[][] matrix) {
        for (int i = 0; i < numOfColumns; i++) {
            int sumOfEachColumns = 0;
            for (int j = 0; j < numOfRow; j++) {
                sumOfEachColumns = sumOfEachColumns + matrix[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column: " + sumOfEachColumns);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfRow, numOfColumns;
        do {
            System.out.println("Enter positive integers \"n\" and \"m\", the size of the matrix:");
            numOfRow = sc.nextInt();
            numOfColumns = sc.nextInt();
        } while (numOfRow <= 0 || numOfColumns <= 0);

        System.out.println("\nYour randomized matrix:");
        int[][] matrix = new int[numOfRow][numOfColumns];
        randomizeMatrix(matrix);

        printMatrix(matrix, numOfRow, numOfColumns);

        System.out.println("\nSum of elements in each column:");
        int sumOfEachColumns = 0;
        int maxSum = sumOfEachColumns, index = 0;
        findSumOfEachColumns(numOfRow, numOfColumns, matrix);
    }
}
