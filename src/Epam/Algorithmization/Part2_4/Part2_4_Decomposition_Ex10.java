package Epam.Algorithmization.Part2_4;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива,
элементами которого являются цифры числа N.

Decompose the entered number N into elements and display them as an array.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex10 {

/*
1. Привести число к строке: String.valueOf(<...>)
2. Строку разбить посимвольно в массив: .split("")
3. Объединить массив в строку с нужным разделителем (", "): String.join(", ", <...>)
*/

    public static void decomposedIntoArray(int a) {
        String array = String.join(", ", String.valueOf(a).split(""));
        System.out.print(array);
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int a;

            do {
                System.out.println("Enter an integer larger than one million:");
                a = sc.nextInt();
            } while (a < 1_000_000);

            System.out.println("Here is an array, that consist of digits from entered your number:");
            decomposedIntoArray(a);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
