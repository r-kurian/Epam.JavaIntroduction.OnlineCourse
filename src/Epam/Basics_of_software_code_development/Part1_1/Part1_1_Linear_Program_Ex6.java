package Epam.Basics_of_software_code_development.Part1_1;
/*
For a given area compose a linear program that prints "true"
if the point with coordinates (x, y) belongs to the filled area,
and "false" otherwise.
 */

/*
Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области,
и false — в противном случае.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_1_Linear_Program_Ex6 {

    public static void main(String[] args) {
        try {

            System.out.println("Write x- and y-coordinates:");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();

            if ((x < -4 || x > 4) && (y < -3 || y > 4)) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
