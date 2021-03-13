package Epam.Algorithmization.Part2_2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное).

Create a square matrix according to example, where every second row is reversed (n is even).

---------------------------------
1       2       3       ...     n
n       n-1     n-2     ...     1
1       2       3       ...     n
n       n-1     n-2     ...     1
---------------------------------
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex4 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            int numOfRowAndColumns;
            do {
                System.out.println("Enter an even integer \"n\", the size of square matrix:");
                numOfRowAndColumns = in.nextInt();
            } while (numOfRowAndColumns <= 0 || numOfRowAndColumns % 2 != 0);

            int matrix[][] = new int[numOfRowAndColumns][numOfRowAndColumns];
            for (int i = 0; i < numOfRowAndColumns; i += 2)
                for (int j = 0; j < numOfRowAndColumns; ++j)
                    matrix[i][j] = j + 1;
            for (int i = 1; i < numOfRowAndColumns; i += 2)
                for (int j = 0; j < numOfRowAndColumns; ++j)
                    matrix[i][j] = numOfRowAndColumns - j;

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
