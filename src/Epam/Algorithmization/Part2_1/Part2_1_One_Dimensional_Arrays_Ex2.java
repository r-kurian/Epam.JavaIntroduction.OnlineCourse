package Epam.Algorithmization.Part2_1;

/*
Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.

In a sequence of real numbers a1, a2 ...  an replace all elements
greater than Z with this number. Count the number of replacement.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex2 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = in.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
                array[i] = (int) (Math.random() * 100);

            System.out.println("Enter an integer for replacement:");
            int z = in.nextInt();

            System.out.println("Your array:");
            for (int a : array)
                System.out.print(a + " ");

            System.out.println();
            int replacement = 0;
            for (int i = 0; i < n; ++i) {
                if (array[i] > z) {
                    array[i] = z;
                    ++replacement;
                }
            }

            System.out.println("Changed array:");
            for (int a : array)
                System.out.print(a + " ");
            System.out.println("\nNumbers of replacement = " + replacement);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
