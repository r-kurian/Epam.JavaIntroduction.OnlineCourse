package Epam.Algorithmization.Part2_4;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.

From the given number subtract the sum of its digits.
From the result subtract the sum of its digits, etc.
How many such interactions should be performed to get zero?
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex17 {

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }

    static int numOfIterations(int n) {
        int times = 0;
        while (n > 0) {
            n = n - sumOfDigits(n);
            times++;
        }
        return times;
    }

    static void printIterations(int n) {

        System.out.println((n) + " - " + (sumOfDigits(n))); //first iteration

        for (int i = 0; i <= n; i += 1) {
            n = n - sumOfDigits(n);
            System.out.println((n) + " - " + (sumOfDigits(n)));
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter an integer that consist of two or more digits: ");
                n = sc.nextInt();
            } while (n <= 9);

            System.out.println("Number of iterations = " + numOfIterations(n));

            System.out.println("\nAll iterative subtractions of the sum of digits \nbefore entered number becomes zero:");
            printIterations(n);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
