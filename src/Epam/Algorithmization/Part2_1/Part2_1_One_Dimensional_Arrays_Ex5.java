package Epam.Algorithmization.Part2_1;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

// Given real numbers a1, a2, ..., an. Print only those numbers for which ai > i.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex5 {
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

            // нахождение чисел массива больше введенного
            System.out.println();
            System.out.println("Array elements greater than the entered number " + n + ":");
            for (int j = 0; j < n; ++j) {
                if (array[j] > i)
                    System.out.print(array[j] + "   ");
            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
