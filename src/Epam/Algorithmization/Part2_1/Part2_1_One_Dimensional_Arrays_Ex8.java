package Epam.Algorithmization.Part2_1;

/*
Дана последовательность целых чисел a1,a2,...,an .
Образовать новую последовательность, выбросив из исходной те члены,
которые равны min(a1,a2,...,an) .

Given a sequence of integers a1, a2, ..., an.
Create a new sequence without integers that are equal to min (a1, a2, ..., an).
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex8 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = in.nextInt();
            if (n <= 0) throw new IllegalArgumentException("Array size cannot be zero or negative!");

            int[] array = new int[n];
            int i;
            for (i = 0; i < n; i++)
                array[i] = (int) (Math.random() * 100);
            System.out.println("Your array:");
            for (int a : array)
                System.out.print(a + "   ");

            int min = array[0];             // минимальное значение
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
            }
            System.out.println("\n\nYour min value = " + min);

            int j;                          //поиск удаляемого элемента
            for (j = 0; j < n; j++)
                if (array[j] == min)
                    break;

            for (int k = j; k < n - 1; k++) //сдвиг последующих элементов
                array[k] = array[k + 1];
            n--;                            //уменьшение размера

            System.out.println("\nNew array without minimum value:");
            for (j = 0; j < n; j++)         //вывод элементов
                System.out.print(array[j] + "   ");

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}