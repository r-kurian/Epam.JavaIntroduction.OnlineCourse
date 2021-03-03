package Epam.Basics_of_software_code_development.Part1_3;

/*
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.

Write a program where the user enters any positive integer.
And the program adds up all numbers from 1 to the number entered by the user.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_3_Loops_Ex1 {
    public static void main(String[] args) {
        try {

            System.out.println("This program summarizes all numbers from 1 to the number you entered.");
            System.out.println("Enter any positive integer:");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int sum = 0;

            while (x<=0) {
                System.out.println("Incorrect input data, try again");
                x = in.nextInt();
            }

            if (x >= 1) {
                for (int i = 1; i <= x; i++) {
                    sum = sum + i;
                }
            }
            System.out.println("The sum of numbers from 1 to the number you entered = " + sum);

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
