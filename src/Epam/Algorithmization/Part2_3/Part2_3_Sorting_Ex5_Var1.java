package Epam.Algorithmization.Part2_3;
/*
Сортировка вставками. Дана последовательность чисел a1, a2, ... an.
Требуется переставить числа в порядке возрастания. Делается это следующим образом.
Пусть a1, a2 ... ai - упорядоченная последовательность, т. е. a1 <=  a2  <=  .... an .
Берется следующее число ai+1 и вставляется в последовательность так,
чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор,
пока все элементы от i +1 до n не будут перебраны.

Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

--------------------------------------------------------------------------------

Binary Insertion sort. Binary insertion sort uses the binary search to find the right position
to insert an element at a specific index at every iteration. First, the location where the element
needs to be inserted is found. Then, the elements are shifted to the next right location.
Now, the specific element is placed in the position.

Binary search is used to reduce the number of comparisons in normal insertion sort.
In normal insertion sort, it takes O(n) comparisons (at nth iteration) in the worst case.
We can reduce it to O(log n) by using binary search.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_3_Sorting_Ex5_Var1 {

    static void randomizeAndPrintArray(int[] array, int n) {
        for (int i = 0; i < n; ++i)
            array[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + "  ");
        System.out.println();
    }

    static int binarySearch(int[] array, int n, int key) {
        int l = -1;
        int r = n;
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (array[m] < key)
                l = m;
            else
                r = m;
        }
        return r;
    }

    static void insertionSort(int[] array, int n) {
        for (int i = 1; i < n; ++i) {
            int x = array[i];
            int j = binarySearch(array, i, x);
            for (int k = i; k > j; --k)
                array[k] = array[k - 1];
            array[j] = x;
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

            System.out.print("\nArray ordered with a help of Binary Insertion sort:\n");
            insertionSort(array, n);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
