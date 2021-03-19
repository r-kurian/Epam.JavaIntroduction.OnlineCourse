package Epam.Strings_and_basics_of_text_processing.Part3_1;

// В строке найти количество чисел.

// Find the number of integers in the string.

import java.util.Scanner;

public class Part3_1_String_Array_Ex4 {
    public static void main(String[] args) {
        System.out.println("Enter some string with integers:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        // The subexpression/metacharacter “\D” matches the non-digits.
        String[] numOfIntegers = myString.replaceAll("\\D", " ").split(" ");
        int count = 0;
        for (String s : numOfIntegers) {
            if (s.length() > 0) {
                count++;
            }
        }
        for (String s : numOfIntegers) {
            System.out.print(s + "_");
        }
        System.out.println("\nYour string has " + count + " numbers.");
    }
}
