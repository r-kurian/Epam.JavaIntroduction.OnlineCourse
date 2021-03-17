package Epam.Strings_and_basics_of_text_processing.Part3_2;

// В строке вставить после каждого символа 'a' символ 'b'.

// After each character 'a' insert character 'b'.

import java.util.Scanner;

public class Part3_2_String_Object_Ex2 {

    public static void main(String[] args) {
        System.out.println("Enter some string with a lot of chars \"a\":");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        String myStringWithReplacement = myString.replaceAll("a", "ab");

        System.out.println("\nAfter all char \"a\" in your string was added char \"b\":");
        System.out.println(myStringWithReplacement);

        int count = (int) myString.chars().filter(ch -> ch == 'a').count(); // lambda
        System.out.println("\nThe number of replacement in your string: " + count);
    }
}
