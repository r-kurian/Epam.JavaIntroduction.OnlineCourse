package Epam.Basics_of_software_code_development.Part1_2;
/*
Даны два угла треугольника (в градусах). Определить,
существует ли такой треугольник, и если да, то будет ли он прямоугольным.

Are given two angles of the triangle (in degrees).
Find, if such a triangle exists, and if so, whether it will be rectangular.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_2_Branching_Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the values for the two corners of the triangle.");
            System.out.println("The value cannot exceed 180! ");
            Scanner in = new Scanner(System.in);

            int x = in.nextInt();
            int y = in.nextInt();

            if ((180 - x - y) >= 0) {
                System.out.println("A triangle with such angles exists!");
                if (((180 - x - y) == 90) || x == 90 || y == 90)
                    System.out.println("Right triangle");
            } else {
                System.out.println("Try to put another values for the angles of a triangle.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
