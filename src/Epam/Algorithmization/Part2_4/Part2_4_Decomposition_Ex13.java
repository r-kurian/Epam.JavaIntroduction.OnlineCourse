package Epam.Algorithmization.Part2_4;
/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.

The program finds all twin prime numbers on the line segment [n, 2n], where n > 2
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex13 {

 /*
 If a number is not a prime, it can be factored into two factors f1 and f2.
 If f1 and f2 are > the sqrt of the number, f1*f2 would be > the number.
 So at least one of those factors must be <= to the sqrt of the number.
 To see if a number is actually prime, we only need to test factors that are <= to the sqrt.
 */

    static boolean checkIsPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findAllTwinPrimeNumbers(int start) {
        for (int i = start; i <= start * 2; i++) {
            if (checkIsPrime(i) && checkIsPrime(i + 2)) {
                System.out.println(i + "  " + (i + 2));
            }
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            int start;
            do {
                System.out.println("Enter the integer \"n\" for line segment [n, 2n]. Attention! n > 2 :");
                start = sc.nextInt();
            } while (start < 2);

            System.out.println("\nHere are all twin prime numbers on the line segment from "
                    + start + " to " + start * 2 + ":");

            findAllTwinPrimeNumbers(start);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
