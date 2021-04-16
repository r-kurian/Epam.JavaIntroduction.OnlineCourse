package Epam.Algorithmization.Part2_2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).

Create a square matrix according to an example (n is even).
-------------------------------------------------
1       1       1       ...     1       1       1
2       2       2       ...     2       2       0
3       3       3       ...     3       0       0
...     ...     ...     ...     ...     ...     ...
n-1     n-1     0       ...     0       0       0
n       0       0       ...     0       0       0
-------------------------------------------------
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex5 {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int numOfRowAndColumns;
            do {
                System.out.println("Enter an even integer \"n\", the size of square matrix:");
                numOfRowAndColumns = sc.nextInt();
            } while (numOfRowAndColumns <= 0 || numOfRowAndColumns % 2 != 0);

            int[][] matrix = new int[numOfRowAndColumns][numOfRowAndColumns];
            for (int i = 0; i < numOfRowAndColumns; ++i) {
                for (int j = 0; j < matrix[i].length - i; ++j) {
                    matrix[i][j] = i + 1;
                }
            }

            System.out.println("Your square matrix:");
            for (int i = 0; i < numOfRowAndColumns; ++i) {
                for (int j = 0; j < numOfRowAndColumns; ++j)
                    System.out.print(matrix[i][j] + "  ");
                System.out.println();
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}