package Epam.Algorithmization.Part2_2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

Create a square matrix according to an example (n is even).

---------------------------------
1   1   1   ...     1   1   1
0   1   1   ...     1   1   0
0   0   1   ...     1   0   0
.............................
0   1   1   ...     1   1   0
1   1   1   ...     1   1   1
---------------------------------
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex6 {

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int numOfRowAndColumns;
            do {
                System.out.println("Enter an even integer \"n\", the size of square matrix:");
                numOfRowAndColumns = sc.nextInt();
            } while (numOfRowAndColumns <= 0 || numOfRowAndColumns % 2 != 0);

            // matrix according example
            int[][] matrix = new int[numOfRowAndColumns][numOfRowAndColumns];

            for (int i = 0; i < numOfRowAndColumns / 2; ++i)                // upper part
                for (int j = i; j < numOfRowAndColumns - i; ++j)
                    matrix[i][j] = 1;

            for (int i = numOfRowAndColumns / 2; i < numOfRowAndColumns; ++i) // bottom part
                for (int j = 0; j < numOfRowAndColumns; ++j)
                    matrix[i][j] = matrix[numOfRowAndColumns - i - 1][j];

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
