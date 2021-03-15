package Epam.Strings_and_basics_of_text_processing.Part3_1;

// В строке найти количество цифр.

// Find the number of digits in the string.

import java.util.Scanner;

public class Part3_1_String_Array_Ex3 {
    // \d matches any digit. The extra \ in \\d is used to escape the backslash from the string.

    public static void main(String[] args) {
        System.out.println("Enter some string with digits:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        int numOfDigits = myString.length() - myString.replaceAll("\\d", "").length();
        System.out.println("The number of digits in your string = " + numOfDigits);
    }
}
