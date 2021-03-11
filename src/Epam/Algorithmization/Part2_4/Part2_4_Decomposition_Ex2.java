package Epam.Algorithmization.Part2_4;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

// Greatest Common Divisor (GCD) of more than two (or array) numbers.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex2 {

/*
The GCD of three or more numbers equals the product of the prime factors common to all the numbers,
but it can also be calculated by repeatedly taking the GCDs of pairs of numbers.
*/

    static void randomizedAndPrintArray(int[] array, int n) {
        int i;
        for (i = 0; i < n; ++i)
            array[i] = (int) (Math.random() * 100);
        for (int a : array)
            System.out.print(a + "  ");
    }

    static int gcd (int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int gcdForSeveralElements(int array[]) {
        int result = 0;
        for (int element : array) {
            result = gcd(result, element);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter positive integers \"n\", the number of randomized elements:");
            int n = in.nextInt();
            if (n <= 0) throw new IllegalArgumentException("Array size cannot be zero or negative!");

            int[] array = new int[n];
            System.out.println("\nYour randomized elements:");
            randomizedAndPrintArray(array, n);

            System.out.print("\n\nGCD for your " + n + " randomized elements: " + gcdForSeveralElements(array));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
