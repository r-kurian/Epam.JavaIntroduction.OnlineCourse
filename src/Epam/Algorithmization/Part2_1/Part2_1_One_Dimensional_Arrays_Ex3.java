package Epam.Algorithmization.Part2_1;

/*
Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

Find out how many negative, positive and zero elements are in a given array N.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex3 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; ++i)
                array[i] = (int) ((Math.random() - 0.5) * 100);
            System.out.println("Your array:");
            for (int a : array)
                System.out.print(a + " ");

            int positive = 0;
            int negative = 0;
            int zero = 0;

            for (double a : array) {
                if (a > 0)
                    ++positive;
                else if (a < 0)
                    ++negative;
                else
                    ++zero;
            }
            System.out.println();
            System.out.println("Number of positive elements = " + positive);
            System.out.println("Number of negative elements = " + negative);
            System.out.println("Number of zero elements = " + zero);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
