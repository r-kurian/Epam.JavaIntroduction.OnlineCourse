package Epam.Algorithmization.Part2_4;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.

Find the Armstrong numbers from 1 to k.
A positive number is called armstrong number if it is equal to the sum of cubes of its digits
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex14 {


    static void findAndPrintArmstrongNumber(int start, int end) {
        int temp, num, rem, i, counter = 0;

        for (i = start + 1; i < end; i++) {
            temp = i;
            num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + rem * rem * rem;
                temp = temp / 10;
            }
            if (i == num) {
                if (counter == 0) {
                    System.out.println("Armstrong Numbers between " + start + " and " + end + ": ");
                }
                System.out.print(i + "  ");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There is no Armstrong number in the range from " + start + " to " + end);
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            int start, end;
            do {
                System.out.println("Enter integer \"a\" to indicate START of the line segment:");
                start = sc.nextInt();
                System.out.println("Enter integer \"b\" to indicate END of the line segment:");
                end = sc.nextInt();
            } while (start < 1 || end < start);

            findAndPrintArmstrongNumber(start, end);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
