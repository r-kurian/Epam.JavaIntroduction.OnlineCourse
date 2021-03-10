package Epam.Algorithmization.Part2_1;

/*Даны действительные числа a_1 ,a_2 ...a_n .
Найти max ( a_1 + a_2n, a_2 + a_2n−1,.... a_n + a_n+1).

Given a real numbers a_1, a_2 ... a_n.
Find max (a_1 + a_2n, a_2 + a_2n − 1, .... a_n + a_n + 1).
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex7 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = in.nextInt();
            if (n <= 0) throw new IllegalArgumentException("Array size cannot be zero or negative!");

            int[] array = new int[n];
            int i;
            for (i = 0; i < n; ++i)
                array[i] = (int) (Math.random() * 100);
            System.out.println("\nYour array:");
            for (int a : array)
                System.out.print(a + "   ");

            System.out.println("\nResult:");
            double max = array[0] + array[n - 1];
            double temp;

            for (int j = 0; j < array.length / 2; j++) {
                temp = array[j] + array[array.length - 1 - j];
                if (temp > max) {
                    max = temp;
                }
            }
            System.out.println("max ( a_1 + a_2n, a_2 + a_2n−1,.... a_n + a_n+1) = " + max);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
