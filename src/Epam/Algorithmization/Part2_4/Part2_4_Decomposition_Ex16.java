package Epam.Algorithmization.Part2_4;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме.
Для решения задачи использовать декомпозицию.

Find the sum of n-digit numbers containing only odd digits.
Also find how many even digits are in the found sum.
To solve the problem, use decomposition.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex16 {

    public static int getNthDigit(long number, int n) {
        return (int) ((number / Math.pow(10, n - 1)) % 10);
    }

    public static int getNumOfDigits(long num) {
        int size = 0;

        while (num > 0) {
            size++;
            num /= 10;
        }
        return size;
    }

    public static boolean hasOnlyOddDigits(int num) {
        int numOfDigits = getNumOfDigits(num);
        boolean onlyOdd = true;

        while (numOfDigits > 0) {
            if (getNthDigit(num, numOfDigits) % 2 == 0) {
                onlyOdd = false;
                break;
            }
            numOfDigits--;
        }
        return onlyOdd;
    }

    public static long sumOfNumWithOddDigits(int n) {
        int startNum = (int) Math.pow(10, n - 1);
        int endNum = (int) Math.pow(10, n) - 1;
        long sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            if (hasOnlyOddDigits(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int calcNumOfEven(long num) {
        int numOfDigits = getNumOfDigits(num);
        int numOfEven = 0;

        while (numOfDigits > 0) {
            if (getNthDigit(num, numOfDigits) % 2 == 0) {
                numOfEven++;
            }
            numOfDigits--;
        }
        return numOfEven;
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter an integer 1<n<9 that defines the number of digits:");
                n = sc.nextInt();
                System.out.println("Please wait, calculation can take some time....");
            } while (n <= 0);

            long sum = sumOfNumWithOddDigits(n);
            System.out.println("\nThe sum of n-digit number, that contains only odd digits = " + sum);
            System.out.println("\nThe number of even digits in this sum = " + calcNumOfEven(sum));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}