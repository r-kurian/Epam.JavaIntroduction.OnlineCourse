package Epam.Algorithmization.Part2_2;

/*
Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней.
The program creates a matrix according to the function and counts the number of positive numbers in it.

 A[i,j]=sin( (i^2-j^2)/N) )

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex7 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            int numOfRowAndColumn;
            do {
                System.out.println("Enter an integer \"n\", the size of square matrix:");
                numOfRowAndColumn = in.nextInt();
            } while (numOfRowAndColumn <= 0);


            double matrix[][] = new double[numOfRowAndColumn][numOfRowAndColumn];
            int countOfPositiveNum = 0;
            System.out.println("Your square matrix acc. to the function A[i,j]=sin( (i^2-j^2)/N):\n");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / matrix.length);
                    if (matrix[i][j] > 0) {
                        countOfPositiveNum++;
                    }
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println("\n\nNumber of positive elements in the matrix = " + countOfPositiveNum);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
