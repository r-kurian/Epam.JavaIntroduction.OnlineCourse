package Epam.Algorithmization.Part2_1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.

Find the most frequent number in the array.
If there are several such numbers, then find the smallest.
*/
public class Part2_1_One_Dimensional_Arrays_Ex9 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = in.nextInt();
            if (n <= 0) throw new IllegalArgumentException("Array size cannot be zero or negative!");

            int[] array = new int[n];
            int i;
            for (i = 0; i < n; i++)
                array[i] = (int) (Math.random() * 10);
            System.out.println("Here is your array: " + Arrays.toString(array));

            // Поиск числа
            Arrays.sort(array);
            int maxRepeat = 0;
            int minNumber = 0;
            for (int k = 0; k < array.length; k++) {
                int count = 0;

                for (int j = 0; j < array.length; j++) {
                    if (array[k] == array[j]) {
                        count++;

                        if (count > maxRepeat) {
                            maxRepeat = count;
                            minNumber = array[k];
                        }
                    }
                }
            }
            System.out.println("Your array is sorted: " + Arrays.toString(array));
            System.out.println("The smallest most repeatable number " + minNumber
                    + " has been repeated " + maxRepeat + " times.");

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
