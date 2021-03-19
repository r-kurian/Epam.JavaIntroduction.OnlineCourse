package Epam.Algorithmization.Part2_2;

/*
Найти положительные элементы главной диагонали квадратной матрицы.

Find the positive elements of the main diagonal of a square matrix.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex10 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int numOfRowsAndColumns;
            do {
                System.out.println("Enter an integer \"n\", the size of square matrix:");
                numOfRowsAndColumns = sc.nextInt();
            } while (numOfRowsAndColumns <= 0);

            int matrix[][] = new int[numOfRowsAndColumns][numOfRowsAndColumns];
            for (int i = 0; i < numOfRowsAndColumns; ++i)
                for (int j = 0; j < numOfRowsAndColumns; ++j)
                    matrix[i][j] = -50 + (int) (Math.random() * 100); // [-50 : +50]

            System.out.println("Your square matrix:");
            for (int i = 0; i < numOfRowsAndColumns; ++i) {
                for (int j = 0; j < numOfRowsAndColumns; ++j)
                    System.out.print(matrix[i][j] + "  ");
                System.out.println();
            }

            System.out.println("Positive numbers in a main diagonal:");
            for (int i = 0; i < numOfRowsAndColumns; ++i)
                if (matrix[i][i] > 0)
                    System.out.print(matrix[i][i] + "  ");
            System.out.println();

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
