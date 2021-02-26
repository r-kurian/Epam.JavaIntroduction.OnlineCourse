package Epam.Basics_of_software_code_development.Part1_1;

/*
Вычисляет выражения по формуле / calculates expressions according to using the formula:
(b+sqrt(b^2+4*a*c))/(2*a) - a^3*c+ b^-2
 */



import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Part1_1_Linear_Program_Ex2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Please enter a value to the variable \"a\": ");
            double a = in.nextDouble();
            System.out.println("The variable \"a\" = " + a);

            System.out.println("Please enter a value to the variable \"b\": ");
            double b = in.nextDouble();
            System.out.println("The variable \"b\" = " + b);

            System.out.println("Please enter a value to the variable \"c\": ");
            double c = in.nextDouble();
            System.out.println("The variable \"c\" = " + c);

            double result;
            result = ((b + sqrt((pow(b, 2) + 4 * a * c))) / 2 * a) - (pow(a, 3) * c + pow(b, -2));
            System.out.println("The result of function (b+sqrt(b^2+4*a*c))/(2*a) - a^3*c+ b^-2 = " + result);

        } catch (InputMismatchException ex) {
            System.out.println("\nInput error! " + ex.getMessage());
        }
    }
}
