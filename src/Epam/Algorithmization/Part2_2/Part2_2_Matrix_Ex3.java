package Epam.Algorithmization.Part2_2;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
Given a 2D matrix. Print k-row and p-column of the matrix.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex3 {

    public static void main(String[] args) {
        try {

            // Matrix creating
            Scanner sc = new Scanner(System.in);
            int numOfRow, numOfColumns;
            do {
                System.out.println("Enter integers \"n\" and \"m\", the size of the matrix:");
                numOfRow = sc.nextInt();
                numOfColumns = sc.nextInt();
            } while (numOfRow <= 0 || numOfColumns <= 0);

            int matrix[][] = new int[numOfRow][numOfColumns];
            for (int i = 0; i < numOfRow; ++i)
                for (int j = 0; j < numOfColumns; ++j)
                    matrix[i][j] = 10 + (int) (Math.random() * 89); // [10-99]
            System.out.println("Your matrix:");
            for (int i = 0; i < numOfRow; ++i) {
                for (int j = 0; j < numOfColumns; ++j)
                    System.out.print(matrix[i][j] + " ");
                System.out.println();
            }

            // Line and Column creating
            System.out.println();
            int k, p;
            do {
                System.out.println("\nEnter integers \"k\" and \"p\", the numbers of row and column:");
                k = sc.nextInt();
                p = sc.nextInt();
            } while (k < 1 || k > numOfRow || p < 1 || p > numOfColumns);

            System.out.println("\nElements of the row #" + k + ":");
            for (int j = 0; j < numOfColumns; ++j)
                System.out.print(matrix[k - 1][j] + "  ");
            System.out.println();

            System.out.println("\nElements of the column #" + p + ":");
            for (int i = 0; i < numOfRow; ++i)
                System.out.println(matrix[i][p - 1]);


        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
