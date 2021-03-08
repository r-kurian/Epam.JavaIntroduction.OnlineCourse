package Epam.Basics_of_software_code_development.Part1_3;

/*
Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.

Find the common character included in the two given numbers.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_3_Loops_Ex8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two natural numbers \"m\" and \"n\":");
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean[] arr1 = new boolean[10];

            /* Массив цифр. Если в ячейке с индексом idx установлен 0,
        значит, цифра idx не входит ни в одно число
            Если в ячейке с индексом idx установлена 1,
        значит, одна из цирф имеет в своем представлении цифру idx.
            Если в ячейке с индексом idx установлена 2,
        значит, цирфа idx-общая цирфа
        */

            for (int i = 0; i < 10; ++i)
                arr1[i] = false;

            boolean[] arr2 = new boolean[10];
            for (int i = 0; i < 10; ++i)
                arr2[i] = false;

            while (a > 0) {
                arr1[a % 10] = true;
                a /= 10;
            }

            while (b > 0) {
                arr2[b % 10] = true;
                b /= 10;
            }

            boolean f = false;

            for (int i = 0; i < 10; ++i) {
                if (arr1[i] && arr2[i]) {
                    System.out.print(i + "  ");
                    f = true;
                }
            }
            System.out.println();

            if (!f)
                System.out.println("No common characters found for entered numbers");
        } catch (InputMismatchException e) {
            System.out.println("Input error! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}