package Epam.Strings_and_basics_of_text_processing.Part3_2;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
восклицательным или вопросительным знаком. Определить количество предложений в строке X.

String X consists of several sentences, each ending with a period,
exclamation mark, or question mark. Find out the number of sentences in entered string.
*/

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3_2_String_Object_Ex10 {

    public static void main(String[] args) {
        System.out.println("Enter some string:");

        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        // var #1
        StringTokenizer stMyString = new StringTokenizer(myString, ".!?"); // creates StringTokenizer with specified string and delimiter.
        System.out.println("\nVar #1. The number of sentences in the string = " + stMyString.countTokens()); // returns the total number of tokens.

        // var #2
        int sentenceInMyString = myString.length() - myString.replaceAll("\\.|\\!|\\?", "").length();
        System.out.println("\nVar #2. The number of sentences in the string = " + sentenceInMyString);

        // var #3
        Pattern pattern = Pattern.compile("\\.|\\!|\\?"); // The or operator is explicit and is represented by the pipe character |.
        Matcher matcher = pattern.matcher(myString);
        int countMarks = 0;
        while (matcher.find()) {
            countMarks++;
        }
        System.out.println("\nVar #3. The number of sentences in the string = " + countMarks);
/*
1) Java characters that have to be escaped in regular expressions are: \.[]{}()<>*+-=!?^$|
2) Two of the closing brackets (] and }) are only need to be escaped after opening the same type of bracket.
3) In []-brackets some characters (like + and -) do sometimes work without escape.
*/
    }
}
