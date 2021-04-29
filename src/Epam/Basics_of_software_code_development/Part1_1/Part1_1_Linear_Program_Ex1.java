package Epam.Basics_of_software_code_development.Part1_1;

// Find the value of the function: 	z = ((a - 3) * b / 2) + c

// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_1_Linear_Program_Ex1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Assign the value to the variable \"a\": ");
            double a = in.nextDouble();
            System.out.println("The variable \"a\" = " + a);

            System.out.println("Assign the value to the variable \"b\": ");
            double b = in.nextDouble();
            System.out.println("The variable \"b\" = " + b);

            System.out.println("Assign the value to the variable \"c\": ");
            double c = in.nextDouble();
            System.out.println("The variable \"c\" = " + c);

            double z = ((a - 3) * b / 2) + c;
            System.out.println("OK, \"z\" in function ((a-3)*b/2)+c =  " + z);
        } catch (InputMismatchException ex) {

            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
