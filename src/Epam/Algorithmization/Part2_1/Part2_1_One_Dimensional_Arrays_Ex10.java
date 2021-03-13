package Epam.Algorithmization.Part2_1;

/*
Дан целочисленный массив с количеством элементов п.
Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
Примечание: дополнительный массив не использовать.

Delete every second element from the array and fill the vacated elements with zeros.
Note: do not use an additional array.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Part2_1_One_Dimensional_Arrays_Ex10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        if (n <= 0) throw new IllegalArgumentException("Array size cannot be zero or negative!");

        int[] array = new int[n];
        int i;
        for (i = 0; i < n; i++)
            array[i] = (int) (Math.random() * 10);
        System.out.println("Here is your array: " + "\n" + Arrays.toString(array));


        for (int k = 1; k <= n / 2; k++) {
            array[k] = 0;

            for (int j = k; j < n - 1; j++) {
                //swap без использования буфера
                array[j + 1] += (array[j] - (array[j] = array[j + 1]));
            }
        }
        System.out.println("Here is shrink array. Every second element was deleted " +
                "and replaced by zero: " + "\n" + Arrays.toString(array));
    }
}

