package Epam.Basics_of_software_code_development.Part1_3;

/*
Вычислить значения функции на отрезке [а,b] c шагом h:

Find the values of the function on the segment [a, b] with step h:

x, x>2
-x, x<=2

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_3_Loops_Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter the values for the beginning and the end of the segment [a, b]:");
        int a = 0;
        int b = 0;
        int h = 0;
        int x = 0;
        int i = 0;
        try {
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            b = in.nextInt();
            while (a > b) {
                System.out.println("Incorrect input data, try again");
                a = in.nextInt();
                b = in.nextInt();
            }
            System.out.println("Enter the values of the step \"h\":");
            h = in.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }

        while (x <= b) {
            x = a + i * h;
            if (x > 2) {
                System.out.println("Function value = " + x);
            } else {
                System.out.println("Function value = " + (-x));
            }
            System.out.println(i++); //не понимаю, почему выдает +1 шаг к длинне отрезка
        }
    }
}
