package Epam.Algorithmization.Part2_4;

/*
Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива,
но больше всех других элементов).

Find the second largest number in the array.
*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex5 {

    static void randomizedAndPrintArray(int[] array, int n) {
        int i;
        for (i = 0; i < n; ++i)
            array[i] = (int) (-50 + Math.random() * 100);
        for (int a : array)
            System.out.print(a + "  ");
    }

    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            int n;

            do {
                System.out.println("Enter positive integer n>1, the size of the array:");
                n = in.nextInt();
            } while (n < 2);

            int[] array = new int[n];
            System.out.println("\nYour randomized array:");
            randomizedAndPrintArray(array, n);

            System.out.println("\n\nYour sorted array:");
            Arrays.sort(array);
            for (int a : array)
                System.out.print(a + "  ");

            System.out.println("\n\nSecond greatest element = " + array[n - 2]);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
