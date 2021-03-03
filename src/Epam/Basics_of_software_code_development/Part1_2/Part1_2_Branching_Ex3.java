package Epam.Basics_of_software_code_development.Part1_2;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

// Find out if three points  A (x1, y1), B (x2, y2) and C (x3, y3) fall in a straight line.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_2_Branching_Ex3 {
    public static void main(String[] args) {
        try {

            System.out.println("Enter the values for the points А(х1,у1), В(х2,у2) & С(х3,у3):");
            Scanner in = new Scanner(System.in);
            System.out.println("The values for А(х1,у1):");
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            System.out.println("The values for В(х2,у2):");
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            System.out.println("The values for С(х3,у3):");
            int x3 = in.nextInt();
            int y3 = in.nextInt();

            if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
                System.out.println("The points are located on one straight line.");
            } else {
                System.out.println("The points are not located on one straight line.");
            }

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
