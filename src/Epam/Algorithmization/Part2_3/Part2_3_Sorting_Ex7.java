package Epam.Algorithmization.Part2_3;

/*
Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 ...  <= an
и b1  <=  b2  <= ... bm.  Требуется указать те места, на которые нужно вставлять элементы
последовательности b1  <=  b2  <= ... bm  в первую последовательность так,
чтобы новая последовательность оставалась возрастающей.

Two ascending sequences are given. The program shows the places where you can insert the elements
of the second sequence into the first, so that the new sequence is also ascending
(taking into account the shift after insertion).
*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_3_Sorting_Ex7 {

    static void randomizeOrderAndPrintArray1(int array1[], int n) {
        for (int i = 0; i < n; ++i)
            array1[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        Arrays.sort(array1, 0, n); //First array sorting
        for (int i : array1)
            System.out.print(i + "  ");
        System.out.println();
    }

    static void randomizeOrderAndPrintArray2(int array2[], int m) {
        for (int i = 0; i < m; ++i)
            array2[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        Arrays.sort(array2, 0, m); //Second array sorting
        for (int i : array2)
            System.out.print(i + "  ");
        System.out.println();
    }

    static void findPlacesInsertBIntoA(int array1[], int array2[]) {
        int i = 0;
        int j = 0;
        do {
            if (i < array1.length && j < array2.length) {
                if (array1[i] > array2[j]) {
                    System.out.println("insert b[" + j + "]" + " before a[" + i + "]");
                    if (j < array2.length) {
                        j++;
                    }
                } else {
                    if (i < array1.length) {
                        i++;
                    }
                }
            } else if (j < array2.length) {
                System.out.println("Insert b[" + j + "] - b[" + (array2.length - 1) + "] after the last element of a-array");
                break;
            } else {
                break;
            }
        } while (i < array1.length || j < array2.length);
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n, m;

            do {
                System.out.println("Enter positive integers \"n\" and \"m\",the sizes of a- and b- arrays:");
                n = sc.nextInt();
                m = sc.nextInt();
            } while (n < 1 || m < 1);

            System.out.print("\nRandomized a-array in ascending order:\n");
            int array1[] = new int[n];
            randomizeOrderAndPrintArray1(array1, n);

            System.out.print("\nRandomized b-array in ascending order:\n");
            int array2[] = new int[m];
            randomizeOrderAndPrintArray2(array2, m);

            System.out.println("\nPlaces to insert elements from b-array into a-array:");
            findPlacesInsertBIntoA(array1, array2);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
