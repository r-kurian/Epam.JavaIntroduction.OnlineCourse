package Epam.Algorithmization.Part2_3;

// Составить программу, которая приводит дроби к общему знаменателю и упорядочивает их в порядке возрастания.

// Create a program that finds a common denominator of the given fractions and orders them in ascending order.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_3_Sorting_Ex8 {


    static void generateFractions(int[] arrayOfNumerator, int[] arrayOfDenominator) {
        for (int i = 0; i < arrayOfDenominator.length; i++) {
            arrayOfNumerator[i] = (int) (Math.random() * 10 + 1); // couldn't be zero!
            arrayOfDenominator[i] = (int) (Math.random() * 10 + 1); // couldn't be zero!
        }
    }

    static void printFractions(int[] arrayOfNumerator, int[] arrayOfDenominator) {
        for (int i = 0; i < arrayOfDenominator.length; i++) {
            System.out.print(arrayOfNumerator[i] + "/" + arrayOfDenominator[i] + "  ");
        }
    }

    // function to calculate GSD (Greatest Common Divisor)
    static int findGreatestCommonDivisor(int arrayOfNumerator, int arrayOfDenominator) {
        if (arrayOfNumerator == 0)
            return arrayOfDenominator;
        return findGreatestCommonDivisor(arrayOfDenominator % arrayOfNumerator, arrayOfNumerator);
    }

    // function to calculate LCM (Least Common Multiple)
    static int findLeastCommonMultiple(int arrayOfNumerator, int arrayOfDenominator) {
        return (arrayOfNumerator * arrayOfDenominator) / findGreatestCommonDivisor(arrayOfNumerator, arrayOfDenominator);
    }

    // function to calculate LCM (Least Common Multiple) for our Denominator's array
    static void findMyLCM(int[] arrayOfNumerator, int[] arrayOfDenominator, int numOfFractions) {
        int myLCM = arrayOfDenominator[0];
        for (int i = 1; i < numOfFractions; ++i)
            myLCM = findLeastCommonMultiple(myLCM, arrayOfDenominator[i]);
        for (int i = 0; i < numOfFractions; ++i) {
            arrayOfNumerator[i] *= ((double) myLCM / arrayOfDenominator[i]);
            arrayOfDenominator[i] = myLCM;
        }
        System.out.println(myLCM);
    }

    static void orderFractions(int[] arrayOfNumerator, int[] arrayOfDenominator, int numOfFractions) {
        for (int i = 0; i < numOfFractions - 1; ++i) {
            for (int j = i + 1; j < numOfFractions; ++j) {

                if (arrayOfNumerator[i] > arrayOfDenominator[j]) {

                    int tmp = arrayOfNumerator[i];
                    arrayOfNumerator[i] = arrayOfNumerator[j];
                    arrayOfNumerator[j] = tmp;

                    tmp = arrayOfDenominator[i];
                    arrayOfDenominator[i] = arrayOfDenominator[j];
                    arrayOfDenominator[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int numOfFractions;

            do {
                System.out.println("Enter positive integer \"n\", the numbers of fractions:");
                numOfFractions = sc.nextInt();
            } while (numOfFractions < 1);

            int[] arrayOfNumerator = new int[numOfFractions];
            int[] arrayOfDenominator = new int[numOfFractions];

            System.out.println("\nYour fractions:");
            generateFractions(arrayOfNumerator, arrayOfDenominator);
            printFractions(arrayOfNumerator, arrayOfDenominator);

            System.out.println("\n\nLeast Common Multiple:");
            findMyLCM(arrayOfNumerator, arrayOfDenominator, numOfFractions);

            System.out.println("\nSorted fractions:");
            orderFractions(arrayOfNumerator, arrayOfDenominator, numOfFractions);
            printFractions(arrayOfNumerator, arrayOfDenominator);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
