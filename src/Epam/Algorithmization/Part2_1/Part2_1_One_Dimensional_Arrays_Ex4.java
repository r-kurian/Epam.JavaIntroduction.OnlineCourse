package Epam.Algorithmization.Part2_1;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

// Given real numbers a1, a2, ..., an. Swap the largest and smallest numbers.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex4 {
    public static void main(String[] args) {
        try {
            // размер массива
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = in.nextInt();
            if (n <= 0) throw new IllegalArgumentException("Array size cannot be zero or negative!");

            // рандомная генерация массива
            int[] array = new int[n];
            int i;
            for (i = 0; i < n; ++i)
                array[i] = (int) (Math.random() * 100);
            System.out.println("Your array:");
            for (int a : array)
                System.out.print(a + "   ");

            // минимум и максимум значений массива
            Arrays.sort(array);
            int min = array[0], max = array[array.length - 1];
            System.out.println("\n");
            System.out.println("Maximum = " + array[array.length - 1]);
            System.out.println("Minimum = " + array[0]);

            // копирование массива
            int[] swappedArray = Arrays.copyOf(array, array.length);

            // вывод массива с заменой минимум на максимум
            swappedArray[0] = array[array.length - 1];
            swappedArray[swappedArray.length - 1] = array[0];
            System.out.println();
            System.out.println("Swapped array:");
            for (int a : swappedArray)
                System.out.print(a + "   ");

            // внутри числа все равно гуляют... :/

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
