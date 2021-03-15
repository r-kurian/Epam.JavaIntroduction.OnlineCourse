package Epam.Strings_and_basics_of_text_processing.Part3_1;

// Замените в строке все вхождения 'word' на 'letter'.

//  In string replace all word 'word' to 'letter'.

import java.util.Scanner;

public class Part3_1_String_Array_Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter some string with word \"word\":");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        myString = myString.replaceAll("\\bword\\b", "letter");

        System.out.println("Here is you string after replacement \"word\" into \"letter\":");

        System.out.print(myString);
    }
}
