package Epam.Algorithmization.Part2_4;

/* Вычислить площадь правильного шестиугольника со стороной а,
используя метод вычисления площади треугольника.

Find the area of a regular hexagon with side a using the triangle area method.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex3 {

    static double areaOfRegularTriangle(double a) {
        return Math.sqrt(3) / 4 * Math.pow(a, 2);
    }

    static double areaOfRegularHexagon(double areaOfRegularTriangle) {
        return 6 * areaOfRegularTriangle;
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter positive integer \"a\", the side of a regular hexagon:");
            double a = sc.nextDouble();
            if (a <= 0) throw new IllegalArgumentException("Side size cannot be zero or negative!");

            System.out.println("The area of the regular hexagon with side "
                    + a + " = " + areaOfRegularHexagon(areaOfRegularTriangle(a)));

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
