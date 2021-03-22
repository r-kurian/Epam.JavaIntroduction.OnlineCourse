package Epam.Strings_and_basics_of_text_processing.Part3_2;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
Учитывать только английские буквы.

Count the number of lowercase and uppercase letters in the entered string.
*/

import java.util.Scanner;

public class Part3_2_String_Object_Ex9 {

    public static void main(String[] args) {
        System.out.println("Enter some string:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        // var #1
        int lowercaseLettersV1 = myString.length() - myString.replaceAll("[a-z]", "").length();
        int uppercaseLettersV1 = myString.length() - myString.replaceAll("[A-Z]", "").length();

        System.out.println("\nVar #1. The number of lowercase and uppercase letters is the following: ");
        System.out.println("Uppercase letters = " + uppercaseLettersV1 + ", Lowercase letters = " + lowercaseLettersV1);

        // var #2
        int lowercaseLettersV2 = 0, uppercaseLettersV2 = 0;
        for (char i : myString.toCharArray()) {
            if (i >= 'a' && i <= 'z')
                ++lowercaseLettersV2;
            else if (i >= 'A' && i <= 'Z')
                ++uppercaseLettersV2;
        }

        System.out.println("\nVar #2. The number of lowercase and uppercase letters in your string: ");
        System.out.println("Uppercase letters = " + uppercaseLettersV2 + ", Lowercase letters = " + lowercaseLettersV2);
    }
}
