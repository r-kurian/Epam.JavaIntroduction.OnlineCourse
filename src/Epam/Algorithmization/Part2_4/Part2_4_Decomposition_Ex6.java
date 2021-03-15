package Epam.Algorithmization.Part2_4;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

// Write a method that checks if the given three numbers are coprime.

/* Натуральные числа a и b называют взаимно простыми,
если их наибольший общий делитель равен 1 (НОД (a; b) = 1). */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex6 {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static boolean areCoprime(int a, int b, int c) {
        int mygcd = gcd(a, b);
        mygcd = gcd(mygcd, c);
        return mygcd == 1;
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int a, b, c;
            do {
                System.out.println("Enter three positive integers \"a\", \"b\", \"c\":");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
            } while (a < 1 || b < 1 || c < 1);

            if (areCoprime(a, b, c))
                System.out.println("Your integers are coprime");
            else
                System.out.println("Your integers are not coprime");

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
