package Epam.Algorithmization.Part2_2;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

Display all odd columns in the matrix with the first element greater than the last.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int numOfRow;
            int numOfColumns;
            do {
                System.out.println("Enter integers \"n\" and \"m\", the size of the matrix:");
                numOfRow = in.nextInt();
                numOfColumns = in.nextInt();
            } while (numOfRow <= 0 || numOfColumns <= 0);

            // create matrix
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
            // Odd columns in which 1st element is greater than the last one
            System.out.println();
            System.out.println("Odd columns in which 1st element is greater than the last one:");
            for (int j = 0; j < numOfColumns; j += 2) { //шагает по четным?
                if (matrix[0][j] > matrix[numOfRow - 1][j]) { //сравнивает первый и последний
                    for (int i = 0; i < numOfRow; ++i)
                        System.out.print(matrix[i][j] + " ");
                    System.out.println();
                }
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
