package Epam.Algorithmization.Part2_3;

/*
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

// https://ducmanhphan.github.io/2019-05-24-Binary-Insertion-sort/

public class Part2_3_Sorting_Ex5_Var2 {

    static void randomizeAndPrintArray(int[] array, int n) {
        for (int i = 0; i < n; ++i)
            array[i] = 10 + (int) (Math.random() * 89); // [+10 : +99]
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + "  ");
        System.out.println();
    }

    static int findPosition(int[] array, int start, int end, int key) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static void binaryInsertionSort(int[] array, int n) {

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int insertedPosition = findPosition(array, 0, i - 1, key);

            for (int j = i - 1; j >= insertedPosition; --j) {
                array[j + 1] = array[j];
            }
            array[insertedPosition] = key;
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
            binaryInsertionSort(array, n);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
