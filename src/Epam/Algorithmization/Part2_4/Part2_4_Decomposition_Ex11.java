package Epam.Algorithmization.Part2_4;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

// Compare and find which of the two numbers has more digits.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex11 {

    static int lengthOfNum1(int num1) {
        String firstNum = "" + num1;
        return firstNum.length();
    }

    static int lengthOfNum2(int num2) {
        String secondNum = "" + num2;
        return secondNum.length();
    }

    static void compareNumbers(int num1, int num2) {

        if (lengthOfNum1(num1) != lengthOfNum2(num2)) {
            int numWithMoreDigits = (lengthOfNum1(num1) > lengthOfNum2(num2)) ? num1 : num2;
            System.out.println("The integer " + numWithMoreDigits + " consist of more digits");
        } else {
            System.out.println("Your integers consist of the same number of digits");
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two integers to compare the number of their digits:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("\nThe integer " + num1 + " consist of " + lengthOfNum1(num1) + " digits");

            System.out.println("\nThe integer " + num2 + " consist of " + lengthOfNum2(num2) + " digits");

            System.out.println();
            compareNumbers(num1, num2);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
