package Epam.Strings_and_basics_of_text_processing.Part3_2;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".

Remove all duplicate characters and all spaces from the entered string.
For example, if "abc cde def" was entered, the output should be "abcdef".
*/

import java.util.Scanner;

public class Part3_2_String_Object_Ex7 {

    public static String removeDuplicatesAndAllSpaces(String myString) {

    // The trim() method removes whitespace from both ends of a string.

        myString = myString.trim().replaceAll(" ", "");
        StringBuilder sbMyString = new StringBuilder();

/* indexOf() method returns the index of the first character of the substring
passed as a parameter to it. If that substring is not available in the string,
the returned index would be -1.*/

        for (int i=0; i<myString.length(); i++) {
            if (sbMyString.indexOf(myString.charAt(i)+"") == -1) {
                sbMyString.append(myString.charAt(i));
            }
        }
        return sbMyString.toString();
    }

    public static void main(String[] args) {
        System.out.println("Enter some string:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

/*
(.)(?=.*\1) means:
. Find just one instance of any character
? Occurs no or one times, ? is short for {0,1}.
* Occurs zero or more times, is short for {0,}

In your pattern you group elements with round brackets, e.g., ().
This allows you to assign a repetition operator to a complete group.
*/

        String modifiedMyString = myString.replaceAll("(.)(?=.*\\1)", "").replaceAll(" ", "");

        System.out.println("\nVar #1, your string without duplicate characters and all spaces: ");
        System.out.println(modifiedMyString);

        String myStringWithoutDuplicatesAndAllSpaces = removeDuplicatesAndAllSpaces(myString);
        System.out.println("\nVar #2, the string without duplicate characters and all spaces: ");
        System.out.println(myStringWithoutDuplicatesAndAllSpaces);
    }
}
