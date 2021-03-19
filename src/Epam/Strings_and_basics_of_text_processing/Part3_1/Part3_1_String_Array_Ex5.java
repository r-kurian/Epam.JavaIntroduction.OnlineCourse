package Epam.Strings_and_basics_of_text_processing.Part3_1;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
заменить на одиночные пробелы. Крайние пробелы в строке удалить.

Replace the series of extra spaces with single spaces. Remove trailing spaces.
*/

import java.util.Scanner;

public class Part3_1_String_Array_Ex5 {

    // The java lang.string.trim()is a built-in function that eliminates leading and trailing spaces.

    public static void main(String[] args) {
        System.out.println("Enter some string with an extra spaces:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        String myStringWithoutExtraSpaces = myString.replaceAll("\\s+", " ").trim();

        System.out.println("Your string without extra spaces:");
        System.out.println(myStringWithoutExtraSpaces);
    }
}
