package Epam.Algorithmization.Part2_4;

/*
Найти все натуральные n-значные числа, цифры в которых образуют
строго возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию.

Find natural n-digit numbers whose digits form
a strictly increasing sequence (for example 1234, 5789).
To solve the problem, use decomposition.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex15 {

    static void findIncreasingNDigitsNumbers(int n) {
        if (n > 1 && n <= 9) { // макс.диапазон для возрастающих цифр без повторов
            int[] array = new int[n];
            int j = 1;
            do {
                for (int i = 0; i < array.length; i++) {
                    array[i] = j + i;
                }
                int increasingNumber = 0;
                for (int i = 0; i < array.length; i++) {
                    increasingNumber += array[i];
                    if (i == array.length - 1) {
                        continue;
                    }
                    increasingNumber *= 10;
                }
                System.out.print(increasingNumber + "  ");
                j++;
            } while (array[array.length - 1] < 9);
        } else {
            System.out.println("Incorrect value! " + n + " does not belong to the segment 1<n<9");
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter an integer 1<n<9 that defines the number of digits:");
                n = sc.nextInt();
            } while (n <= 0);

            System.out.println("\n" + n + "-digit numbers with increasing sequence of digits: ");
            findIncreasingNDigitsNumbers(n);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
