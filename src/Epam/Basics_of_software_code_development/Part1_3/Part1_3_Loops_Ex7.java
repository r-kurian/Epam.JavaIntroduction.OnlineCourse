package Epam.Basics_of_software_code_development.Part1_3;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа. m и n вводятся с клавиатуры.
*/

/*
For each natural number in the range from m to n, show all divisors except 1 and the number itself.
m and n are entered from the keyboard.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_3_Loops_Ex7 {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter two natural numbers \"m\" and \"n\":");
            int m = in.nextInt();
            int n = in.nextInt();

            if (m <= 0 || n <= 0) {
                throw new IllegalArgumentException("You entered non-natural numbers!");
            }
            if (m > n) {
                throw new IllegalArgumentException("\"n\" must be greater than \"m\"!");
            }

            System.out.println("Number\tits Divisors");
            for (int i = m; i <= n; i++) {
                System.out.print(i + ":\t\t");
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
