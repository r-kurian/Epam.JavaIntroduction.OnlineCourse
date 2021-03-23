package Epam.Algorithmization.Part2_4;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

Find an area of a quadrilateral with one right angle.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex9 {

    static void areaOfQuadrilateral(double x, double y, double z, double t) {

        double areaOfTriangle1 = x * y / 2;
        double hypotenuse = Math.hypot(x, y);
        double halfOfTriangle2 = (hypotenuse + z + t) / 2;
        double areaOfTriangle2;

        if ((z + t > hypotenuse) && (hypotenuse + z >= t) && (hypotenuse + t >= z)) {
            areaOfTriangle2 = Math.sqrt(halfOfTriangle2 * (halfOfTriangle2 - hypotenuse) * (halfOfTriangle2 - z) * (halfOfTriangle2 - t));
        } else {
            System.out.println("Quadrilateral with such sides does not exist.");
            areaOfTriangle2 = areaOfTriangle1 * (-1);
        }

        double square = areaOfTriangle1 + areaOfTriangle2;
        System.out.println("The area of your Quadrilateral = " + square);
    }

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            double x, y, z, t;

            do {
                System.out.println("Enter two sides with a right angle inbetween:");
                x = sc.nextDouble();
                y = sc.nextDouble();
            } while (x < 0 || y < 0);

            do {
                System.out.println("Enter two other sides:");
                z = sc.nextDouble();
                t = sc.nextDouble();
            } while (z < 0 || t < 0);

            areaOfQuadrilateral(x, y, z, t);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
