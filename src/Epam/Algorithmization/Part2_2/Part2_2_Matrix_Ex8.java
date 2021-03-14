package Epam.Algorithmization.Part2_2;

/*
В числовой матрице поменять местами два любых столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.

Swap two columns in a numeric matrix, namely swap all the elements from the first column
to the corresponding positions to the second one and vice versa.
Column numbers are entered by the user from the keyboard.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex8 {

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
            // numbers of columns
            int a, b;
            do {
                System.out.println("\nEnter a positive integers \"a\" and \"b\" - numbers" +
                        " of columns you'd like to swap");
                a = in.nextInt();
                b = in.nextInt();
            } while (a < 1 || a > numOfColumns || b < 1 || b > numOfColumns || a == b);

            // swapping
            for (int i = 0; i < numOfColumns; ++i) {
                int tmp = matrix[i][a - 1];
                matrix[i][a - 1] = matrix[i][b - 1];
                matrix[i][b - 1] = tmp;
            }
            System.out.println("\nSwapped matrix:");
            for (int i = 0; i < numOfRow; ++i) {
                for (int j = 0; j < numOfColumns; ++j)
                    System.out.print(matrix[i][j] + "  ");
                System.out.println();

            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
