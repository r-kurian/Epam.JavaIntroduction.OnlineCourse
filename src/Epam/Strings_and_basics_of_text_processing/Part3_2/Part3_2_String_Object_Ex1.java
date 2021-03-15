package Epam.Strings_and_basics_of_text_processing.Part3_2;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

// Find the largest number of consecutive spaces in the given line.

import java.util.Scanner;

public class Part3_2_String_Object_Ex1 {

    public static void main(String[] args) {
        System.out.println("Enter some string with an extra spaces:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        // String.indexOf - This method returns the index within this string of the first occurrence of the specified character
        // or -1, if the character does not occur.

        int count = 0;
        while (myString.indexOf(' ') != -1) {

            // String replaceFirst: replaces the first substring that fits the specified regular expression with the replacement String
            int temp = myString.length() - myString.replaceFirst("\\s+", "").length();
            myString = myString.replaceFirst("\\s+", "");
            if (temp > count)
                count = temp;
        }
        System.out.println("Max number of spaces in your string = " + count);
    }
}
