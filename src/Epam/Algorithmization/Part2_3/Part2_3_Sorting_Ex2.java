package Epam.Algorithmization.Part2_3;


/*
Даны две последовательности a1 <= a2 ... <= an и b1 <= b2 ... bm.
Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
Примечание. Дополнительный массив не использовать.

Given two arrays: a1 <= a2 ... <= an and b1 <= b2 ... bm.
Create a new ascending array of them.
Note: do not use an additional array.
*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_3_Sorting_Ex2 {

    static void randomizeOrderAndPrintFirstArray(int array1[], int n) {
        for (int i = 0; i < n; ++i)
            array1[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        Arrays.sort(array1, 0, n); //First array sorting
        for (int i : array1)
            System.out.print(i + "  ");
        System.out.println();
    }

    static void randomizeOrderAndPrintSecondArray(int array2[], int m) {
        for (int i = 0; i < m; ++i)
            array2[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        Arrays.sort(array2, 0, m); //Second array sorting
        for (int i : array2)
            System.out.print(i + "  ");
        System.out.println();
    }

    static void mergeArraysInAscendingOrder(int array1[], int array2[]) {

        int[] arrayMerged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, arrayMerged, 0, array1.length);
        System.arraycopy(array2, 0, arrayMerged, array1.length, array2.length);
        Arrays.sort(arrayMerged); //Merged array sorting
        for (int i : arrayMerged)
            System.out.print(i + "  ");
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n, m;

            do {
                System.out.println("Enter positive integers \"n\" and \"m\",the sizes of two arrays:");
                n = sc.nextInt();
                m = sc.nextInt();
            } while (n < 1 || m < 1);

            System.out.print("\nFirst randomized array in ascending order:\n");
            int array1[] = new int[n];
            randomizeOrderAndPrintFirstArray(array1, n);

            System.out.print("\nSecond randomized array in ascending order:\n");
            int array2[] = new int[m];
            randomizeOrderAndPrintSecondArray(array2, m);

            System.out.println("\nMerged array in ascending order:");
            mergeArraysInAscendingOrder(array1, array2);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
