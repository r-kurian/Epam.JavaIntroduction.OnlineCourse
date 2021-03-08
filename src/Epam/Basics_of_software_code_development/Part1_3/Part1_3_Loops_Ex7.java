package Epam.Basics_of_software_code_development.Part1_3;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа. m и n вводятся с клавиатуры.
*/

/*
В цикле перебирать числа от m до n и проверять делимость каждого на натуральные числа от 2 до m-1.
Если число делится нацело на текущий делитель, то выводить делитель на экран.
В конце каждой итерации цикла увеличивать m на единицу.

With a help of loop check the divisibility by natural numbers from 2 to m-1
the numbers from m to n. Display all divisible numbers.
At the end of each iteration, increase m by one.
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
