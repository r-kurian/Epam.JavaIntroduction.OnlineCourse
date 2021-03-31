package Epam.Algorithmization.Part2_3;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 .
Если ai <= ai+1 , то продвигаются на один элемент вперед. Если ai > ai+1 ,
то производится перестановка и сдвигаются на один элемент назад.

Create a program for shell sorting in ascending order.
Shell sort is a sorting technique that is similar to insertion sort,
wherein elements are sorted which are at far ends (either ends) of the array.
This way, the interval size between the next and the second to last element reduces.
This happens for all the elements in the array until the interval distance is reduced to 0.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_3_Sorting_Ex6 {

    static void randomizeAndPrintArray(int[] array, int n) {
        for (int i = 0; i < n; ++i)
            array[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + "  ");
        System.out.println();
    }

/*
A как собственно выбрать величину этого интервала? В своей книги Искусство программирования т.3,
посвященной сортировке, Д.Кнут предлагает следующую формулу: h = 3*h + 1, где — величина интервала.
 */

    static void shellSort(int[] array) {
        int temp;
        int h = 0; //величина интервала

        //вычисляем исходное значение интервала
        while (h <= array.length / 3)
            h = 3 * h + 1;

        for (int k = h; k > 0; k = (k - 1) / 3) {
            for (int i = k; i < array.length; i++) {
                temp = array[i];
                int j;
                for (j = i; j >= k; j -= k) {
                    if (temp < array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = temp;
            }
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
                System.out.println("Enter positive integers \"n\", the size of array:");
                n = sc.nextInt();
            } while (n < 1);

            System.out.print("\nRandomized array:\n");
            int[] array = new int[n];
            randomizeAndPrintArray(array, n);

            System.out.print("\nArray ordered with a help of Shell sort:\n");
            shellSort(array);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
