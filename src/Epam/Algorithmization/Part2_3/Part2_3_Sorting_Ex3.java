package Epam.Algorithmization.Part2_3;

/*
Сортировка выбором. Дана последовательность чисел a1 <= a2 < = .... <= an.
Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.

Write the selection sort algorithm.
Selection sort is basically a selection of an element position
from the start with the other rest of the elements.
Elements are compared and exchanged depending on the condition
and then selection position is shifted to the next position
till it reaches to the end.

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_3_Sorting_Ex3 {
    static void randomizeAndPrintArray(int array[], int n) {
        for (int i = 0; i < n; ++i)
            array[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + "  ");
        System.out.println();
    }

    static void orderThrowSelectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        for (int x : array)
            System.out.print(x + "  ");
        System.out.println();
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n;

            do {
                System.out.println("Enter positive integers \"n\",the size of array:");
                n = sc.nextInt();
            } while (n < 1);

            System.out.print("\nRandomized array:\n");
            int array[] = new int[n];
            randomizeAndPrintArray(array, n);

            System.out.print("\nArray ordered with a help of selection sort algorithm:\n");
            orderThrowSelectionSort(array);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
