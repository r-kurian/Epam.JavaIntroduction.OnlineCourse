package Epam.Algorithmization.Part2_1;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

// Array A [N] contains natural numbers. Find the sum of those elements that are multiples of a given K.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex1 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int sizeOfArray = in.nextInt();
            int array[] = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; ++i)
                array[i] = (int) (Math.random() * 100);

            System.out.println("Enter a divisor:");
            int divisor = in.nextInt();
            int sum = 0;
            for (int a : array) {
                if (a % divisor == 0)
                    sum += a;
            }

            System.out.println("Your array:");
            for (int a : array)
                System.out.print(a + ", ");
            System.out.println("\nThe sum of elements divisible by " + divisor + " = " + sum);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
