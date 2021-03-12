package Epam.Basics_of_software_code_development.Part1_2;
/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.

Enter the dimensions A, B of the rectangular hole and the dimensions x, y, z of the brick.
Find out if the brick can fit through the rectangular hole.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_2_Branching_Ex4 {
    public static void main(String[] args) {

        try {

            System.out.println("Enter the size of a rectangular hole. The sides \"А\" & \"В\":");
            Scanner in = new Scanner(System.in);
            int sideA = in.nextInt();
            int sideB = in.nextInt();
            System.out.println("Enter the size of a brick. The sides \"x\", \"y\" & \"z\":");
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if ((sideA == x && sideB == y) || (sideA == y && sideB == z) || (sideA == z && sideB == x)) {
                System.out.println("The brick can fit through the hole");
            } else {
                System.out.println("Oops! The brick can not fit through the hole");
            }

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}