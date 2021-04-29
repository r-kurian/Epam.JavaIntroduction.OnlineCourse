package Epam.Basics_of_software_code_development.Part1_2;

/*
Find the value of the function: see pdf-file
if: x<=3 x^2-3x+9
if: x>3 1/(x^3+6)
 */

/*
Вычисляет значение функии: см. pdf-файл
если x<=3 x^2-3x+9
если x>3 1/(x^3+6)
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_2_Branching_Ex5 {
    public static void main(String[] args) {
        try {

            System.out.println("Enter the value for \"x\":");
            Scanner in = new Scanner(System.in);
            double x = in.nextDouble();

            double result = (x <= 3 ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6)); // ternary method
            System.out.println("The function value = " + result);

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
