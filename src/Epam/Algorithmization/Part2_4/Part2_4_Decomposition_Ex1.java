package Epam.Algorithmization.Part2_4;

/*
Написать метод(методы) для нахождения наибольшего общего делителя (НОД)
и наименьшего общего кратного (НОК) двух натуральных чисел.

Write methods for finding the greatest common divisor (GCD)
and the least common multiple (LCM) of two natural numbers.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex1 {


    static int findGreatestCommonDivisor(int n, int m) {
        return m == 0 ? n : findGreatestCommonDivisor(m, n % m); // Euclid's Algorithm
    }

    static int findLeastCommonMultiple(int n, int m) {
        return (n * m) / findGreatestCommonDivisor(n, m);
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two integers \"n\" and \"m\":");
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println("\nGreatest Common Divisor (GCD) = " + findGreatestCommonDivisor(n, m));
            System.out.println("\nLeast Common Multiple (LCM) = " + findLeastCommonMultiple(n, m));

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
