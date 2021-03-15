package Epam.Algorithmization.Part2_4;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех
последовательно расположенных элементов массива с номерами от k до m.

In array D find the following sums: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6] etc.
Tip. Find the sum of three consecutive array elements with numbers from k to m.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex8 {
    static void randomizedAndPrintArray(int[] array, int n) {
        int i;
        for (i = 0; i < n; ++i)
            array[i] = (int) (-50 + Math.random() * 100);
        for (int a : array)
            System.out.print(a + "  ");
    }

    // ищет сумму тройников
    public static int sumOfThreeElements(int[] array, int k) {
        int sum = array[k - 1] + array[k] + array[k + 1];
        return sum;
    }

    // Ищет сумму тройных индексов от k до m. Если тройки нет, возвращает 0.
    static int sumOfAllElementsBetweenIndex(int[] array, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m - 2; i++) {
            sum += sumOfThreeElements(array, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            int n, k, m;

            do {
                System.out.println("Enter positive integer \"n\" > 3, the size of the array:");
                n = in.nextInt();
            } while (n < 3);

            int[] array = new int[n];
            System.out.println("\nYour randomized array:");
            randomizedAndPrintArray(array, n);

            do {
                System.out.println("\n\nEnter index \"k\" and \"m\" " +
                        "to find the sum of three elements between these indexes:");
                System.out.println("(Tip: k < m < n)");
                k = in.nextInt();
                m = in.nextInt();
            } while (k > n || m < k);

            System.out.println("The sum of three serial elements from indexes \"k\" to \"m\" = " +
                    +sumOfAllElementsBetweenIndex(array, k, m));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
