package Epam.Algorithmization.Part2_4;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

The program creates an array in which the sum of the digits of each element
is equal to the number K, but not more than N.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex12 {

    static int[] filledArray(int arraySize, int sumOfDigits, int borderNum) {
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            int checkSum = 0;
            array[i] = (int) (Math.random() * borderNum);
            int checkNum = array[i];

            do {
                checkSum += checkNum % 10;
                checkNum /= 10;
            } while (checkNum > 0);

            if (checkSum != sumOfDigits) {
                i--;
            }
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            int arraySize;
            do {
                System.out.println("Enter the size of array:");
                arraySize = sc.nextInt();
            } while (arraySize <= 0);

            int sumOfDigits, borderNum;
            do {
                System.out.println("Enter two integers K and N. \n" +
                        "Your array will be randomly filled with the elements, \n" +
                        "where the digits' sum of each element is equal to K, \n" +
                        "but not more than N.");
                sumOfDigits = sc.nextInt();
                borderNum = sc.nextInt();
            } while (sumOfDigits <= 0 || borderNum <= 0);

            System.out.println("\nHere is your array:");
            printArray(filledArray(arraySize, sumOfDigits, borderNum));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
