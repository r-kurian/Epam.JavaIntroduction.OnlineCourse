package Epam.Strings_and_basics_of_text_processing.Part3_2;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.

Find the longest word and display it on the screen.
The case when there may be several longest words, do not process.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Part3_2_String_Object_Ex8 {

    public static void main(String[] args) {
        System.out.println("Enter some string:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        // var #1
        String longestWord = Arrays.stream(myString.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("\nVar #1. The longest word in your string: ");
        System.out.println(longestWord);

        // var #2
        String[] arrayOfWords = myString.split(" "); // words-array creating
        String longestWordVar2 = "";
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() >= longestWordVar2.length()) { // compare the length of words with the longest word in the array
                longestWordVar2 = arrayOfWords[i];
            }
        }
        System.out.println("\nVar #2. The longest word in your string: ");
        System.out.println(longestWordVar2);
    }
}
