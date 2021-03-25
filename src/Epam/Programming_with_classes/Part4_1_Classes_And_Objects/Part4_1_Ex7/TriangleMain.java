package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex7;

/*
Описать класс треугольника.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

Describe the class of the triangle.
Provide methods for creating objects, calculating the area, perimeter and intersection of the medians.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleMain {

    public double sideA;
    public double sideB;
    public double sideC;

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter three sides of the Triangle");
            System.out.println("Enter side A & side B:");
            double sideA = sc.nextDouble();
            double sideB = sc.nextDouble();

            double sideC;
            do {
                System.out.println("Side C should be greater than sum of sides A+B:");
                sideC = sc.nextDouble();
            } while (sideC <= sideA + sideB);

            Triangle triangle = new Triangle(sideA, sideB, sideC);

            triangle.classifyingOfTriangle ();
            triangle.printSidesOfTriangle();
            triangle.printAreaOfTriangle();
            triangle.printPerimeterOfTriangle();
            triangle.printMedianAndCentroidOfTriangle();

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
