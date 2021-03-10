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

    static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m); // Euclid's Algorithm
    }

    static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two integers \"n\" and \"m\":");
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println("\nGreatest Common Divisor (GCD) = " + gcd(n, m));
            System.out.println("\nLeast Common Multiple (LCM) = " + lcm(n, m));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
