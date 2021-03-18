package Epam.Strings_and_basics_of_text_processing.Part3_2;

// Проверить, является ли заданное слово палиндромом.

// Check if the given word a palindrome is.

import java.util.Scanner;

public class Part3_2_String_Object_Ex3 {

    public static void main(String[] args) {
        System.out.println("Enter some word to check if it is a palindrome:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        StringBuilder sbOfMyString = new StringBuilder(myString);

        if (myString.equals(sbOfMyString.reverse().toString())) {
            System.out.println("The word IS a palindrome");
        } else {
            System.out.println("The word ISN'T a palindrome");
        }
    }
}
