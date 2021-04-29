package Epam.Basics_of_software_code_development.Part1_1;

/*
Calculate the value of the expression using the formula (all variables are valid): see pdf-file
*/

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения)
*/


import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.*;

public class Part1_1_Linear_Program_Ex3 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter a value to the variables in a range from 0 to 360.");
            System.out.println("Attention! Value can not be 90, 180, 270 or 360!");

            System.out.println("Your value to the variable \"x\": ");
            Scanner valueX = new Scanner(System.in);
            double x = valueX.nextDouble();
            if (x < 0 && x > 360) {
                System.out.println("Value should be in a range from 0 to 360. Write it again");
                if (x == 90 || x == 180 || x == 270 || x == 360) {
                    System.out.println("Attention! Value can not be 90, 180, 270 and 360!");
                }
            }

            Scanner valueY = new Scanner(System.in);
            System.out.println("Please enter a value to the variable \"y\": ");
            double y = valueY.nextDouble();
            if (y < 0 && y > 360) {
                System.out.println("Value should be in a range from 0 to 360. Write it again");
                if (y == 90 || y == 180 || y == 270 || y == 360)
                    System.out.println("Attention! Value can not be 90, 180, 270 and 360!");
            }

            double result;
            result = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
            System.out.println("OK, you have following variables: x= " + x + " and y=" + y);
            System.out.println("OK, the result is: " + result);

        } catch (InputMismatchException ex) {
            System.out.println("\nInput error! " + ex.getMessage());
        }
    }
}