package Epam.Basics_of_software_code_development.Part1_1;

/*
Real number R has the form nnn.ddd (three digits in fractional and integer parts).
Swap the fractional and integer parts of the number and print it.
 */

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_1_Linear_Program_Ex4 {
    public static void main(String[] args) {
        try {

            System.out.println("Write a positive number in format \"nnn.ddd\"");
            Scanner in = new Scanner(System.in);
            double x = in.nextDouble();
            int n = (int) x;
            double result = ((x * 1000) % 1000) + (n / 1000.0);
            System.out.println("Here is your number in reversed format \"ddd.nnn\": " + result);

        } catch (InputMismatchException ex) {
            System.out.println("\nInput error!" + ex.getMessage());
        }
    }
}