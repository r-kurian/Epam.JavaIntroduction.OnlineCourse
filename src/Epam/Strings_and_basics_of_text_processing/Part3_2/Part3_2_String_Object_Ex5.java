package Epam.Strings_and_basics_of_text_processing.Part3_2;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

// Count Occurrences of a Char in "a" String

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3_2_String_Object_Ex5 {

    public static void main(String[] args) {

        System.out.println("Enter some string with a lot of chars \"a\":");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        char charA = 'a';

        // Imperative Approach
        int count1 = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == charA) {
                count1++;
            }
        }
        System.out.println("\nVar #1, Imperative Approach");
        System.out.println("Char 'a' occurs in your string  " + count1 + " times");

        // Recursion
        System.out.println("\nVar #2, Recursion");
        System.out.println("Char 'a' occurs in your string  "
                + countOccurrencesWithRecursion(myString, charA) + " times");

        // Regular Expressions
        Pattern pattern = Pattern.compile("[^a]*a");
        Matcher matcher = pattern.matcher(myString);
        int count3 = 0;
        while (matcher.find()) {
            count3++;
        }
        System.out.println("\nVar #3, Regular Expressions");
        System.out.println("Char 'a' occurs in your string  " + count3 + " times");

        //  Java 8 Features: streams and lambdas
        int count4 = (int) myString.chars().filter(ch -> ch == 'a').count();
        System.out.println("\nVar #4, Streams and Lambdas");
        System.out.println("Char 'a' occurs in your string  " + count4 + " times");
    }

    public static int countOccurrencesWithRecursion(String myString, char charA) {

/* Recursive characterization of the operation of counting the occurrences of the charA in the myString:
1) if myString is the empty string "", then return 0;
2) otherwise, if the first character of myString is equal to charA, then return 1 plus the number of occurrences of charA in the string equal to myString without the first character;
3) otherwise (i.e., if the first character of myString is different from charA), return the number of occurrences of charA in the string equal to myString without the first character.
*/
        if (myString.length() == 0)
            return 0;
        else if (myString.charAt(0) == charA)
            return 1 + countOccurrencesWithRecursion(myString.substring(1), charA);
        else
            return countOccurrencesWithRecursion(myString.substring(1), charA);
    }
}
