package Epam.Algorithmization.Part2_3;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.

The program concatenates two one-dimensional arrays into one,
including a second array between k and k + 1 elements of the first,
without using an additional array.

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_3_Sorting_Ex1 {

    static void randomizeAndPrintFirstArray(int array1[], int n) {
        for (int i = 0; i < n; ++i)
            array1[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        for (int i = 0; i < n; ++i)
            System.out.print(array1[i] + "  ");
        System.out.println();
    }

    static void randomizeAndPrintSecondArray(int array2[], int m) {
        for (int i = 0; i < m; ++i)
            array2[i] = -99 + (int) (Math.random() * 89); // [-99 : -10]
        for (int i = 0; i < m; ++i)
            System.out.print(array2[i] + " ");
        System.out.println();
    }

    static void mergeArrays(int array1[], int array2[], int n, int m, int k) {

        int index = 0;
        int[] resArray = new int[array1.length + array2.length];

        for (; index < k; index++) {
            resArray[index] = array1[index];
        }

        for (int j = 0; j < array2.length; j++, index++) {
            resArray[index] = array2[j];
        }

        for (int j = k; j < array1.length; j++, index++) {
            resArray[index] = array1[j];
        }
        for (int x : resArray) {
            System.out.print(x + "  ");
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n, m, k;

            do {
                System.out.println("Enter positive integers \"n\" and \"m\",the sizes of two arrays:");
                n = sc.nextInt();
                m = sc.nextInt();
            } while (n < 1 || m < 1);

            System.out.print("\nFirst array: ");
            int array1[] = new int[n];
            randomizeAndPrintFirstArray(array1, n);

            System.out.print("\nSecond array: ");
            int array2[] = new int[m];
            randomizeAndPrintSecondArray(array2, m);

            do {
                System.out.println("\nEnter positive integer \"k\", the border of the arrays merging:");
                k = sc.nextInt();
            } while (k < 1 || k > n - 1);

            System.out.println("\nMerged arrays:");
            mergeArrays(array1, array2, n, m, k);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}

