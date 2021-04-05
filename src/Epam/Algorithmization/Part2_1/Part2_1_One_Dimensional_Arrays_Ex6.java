package Epam.Algorithmization.Part2_1;

/*
Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами

Given a sequence of N real numbers.
Find the sum of numbers whose ordinal index are prime numbers.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex6 {

    public static boolean isPrime(final int NUM) {
        boolean prime;

        if (NUM <= 1) {
            prime = false;
        } else {
            prime = true;
            int i = 2;
            while (i * i <= NUM) {
                if (NUM % i != 0) {
                    i++;
                } else {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }

    public static int sumOfPrimeIndexes(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }

        return sum;
    }

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

            System.out.println("\n\nThe the sum of prime elements in your array:");
            System.out.println(sumOfPrimeIndexes(array));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}