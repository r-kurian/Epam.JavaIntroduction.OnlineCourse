package Epam.Strings_and_basics_of_text_processing.Part3_2;

// Из заданной строки получить новую, повторив каждый символ дважды.

// Get a new string from the given one by repeating each character twice.

import java.util.Scanner;

public class Part3_2_String_Object_Ex6 {

    public static String allCharRepeatedTwice(String myString) {
        StringBuilder sbMyString = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            sbMyString.append(String.valueOf(myString.charAt(i)).repeat(2));
        }
        return sbMyString.toString();
    }

    public static void main(String[] args) {
        System.out.println("Enter some string:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        System.out.println("Your string with twice-repeated characters:");
        System.out.println(allCharRepeatedTwice(myString));
    }
}
