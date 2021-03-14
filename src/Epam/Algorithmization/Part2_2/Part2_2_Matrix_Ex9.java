package Epam.Algorithmization.Part2_2;

/*
Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.

The program finds the sum of the elements in each column.
Also it finds the column with the highest sum of elements.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex9 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            int numOfRow, numOfColumns;
            do {
                System.out.println("Enter integers \"n\" and \"m\", the size of the matrix:");
                numOfRow = in.nextInt();
                numOfColumns = in.nextInt();
            } while (numOfRow <= 0 || numOfColumns <= 0);
            int matrix[][] = new int[numOfRow][numOfColumns];
            for (int i = 0; i < numOfRow; ++i)
                for (int j = 0; j < numOfColumns; ++j)
                    matrix[i][j] = 10 + (int) (Math.random() * 89); // [10-99]
            System.out.println("\nYour matrix:");
            for (int i = 0; i < numOfRow; ++i) {
                for (int j = 0; j < numOfColumns; ++j)
                    System.out.print(matrix[i][j] + "  ");
                System.out.println();
            }

            // find sums of each column & maximal sum among columns
            int sumOfEachColumns[] = new int[numOfColumns];
            for (int j = 0; j < numOfColumns; ++j)
                sumOfEachColumns[j] = 0;
            for (int i = 0; i < numOfRow; ++i)
                for (int j = 0; j < numOfColumns; ++j)
                    sumOfEachColumns[j] += matrix[i][j];
            System.out.println();
            System.out.println("Sum of elements in each column:");
            for (int j = 0; j < numOfColumns; ++j)
                System.out.print(sumOfEachColumns[j] + "  ");
            System.out.println();

            int maxSum = sumOfEachColumns[0], index = 0;
            for (int j = 1; j < numOfColumns; ++j) {
                if (sumOfEachColumns[j] > maxSum) {
                    maxSum = sumOfEachColumns[j];
                    index = j;
                }
            }
            System.out.println("\nIndex of column with max sum of elements = " + (index + 1));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}