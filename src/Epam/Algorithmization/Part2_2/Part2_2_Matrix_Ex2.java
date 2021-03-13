package Epam.Algorithmization.Part2_2;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

Given a 2D square matrix. Print the diagonal of the square matrix.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex2 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            int numOfRowAndColumns;
            do {
                System.out.println("Enter an integer \"n\", the size of square matrix:");
                numOfRowAndColumns = in.nextInt();
            } while (numOfRowAndColumns <= 0);

            int matrix[][] = new int[numOfRowAndColumns][numOfRowAndColumns];
            for (int i = 0; i < numOfRowAndColumns; ++i)
                for (int j = 0; j < numOfRowAndColumns; ++j)
                    matrix[i][j] = 10 + (int) (Math.random() * 89); // [10-99]

            System.out.println("Your square matrix:");
            for (int i = 0; i < numOfRowAndColumns; ++i) {
                for (int j = 0; j < numOfRowAndColumns; ++j)
                    System.out.print(matrix[i][j] + "  ");
                System.out.println();
            }
            System.out.println();
            System.out.println("Main diagonal, Method 1: \n" +
                    "(In this method, we use two loops i.e. a loop for columns and a loop for rows " +
                    "and in the inner loop we check for the condition stated above)");
            for (int i = 0; i < numOfRowAndColumns; i++) {
                for (int j = 0; j < numOfRowAndColumns; j++) {
                    if (i == j) {
                        System.out.print(matrix[i][j] + "  ");
                    }
                }
            }
            System.out.println("\n");
            System.out.println("Main diagonal, Method 2: \n" +
                    "(In this method, the same condition for printing the diagonal elements " +
                    "can be achieved using a single for loop)");
            for (int i = 0; i < numOfRowAndColumns; ++i) {
                System.out.print(matrix[i][i] + "  ");
            }
            System.out.println("\n");
            System.out.println("Anti-diagonal:");
            for (int i = 0; i < numOfRowAndColumns; ++i) {
                System.out.print(matrix[i][matrix.length - 1 - i] + "  ");
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
