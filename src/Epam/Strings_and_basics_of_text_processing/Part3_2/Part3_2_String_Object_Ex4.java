package Epam.Strings_and_basics_of_text_processing.Part3_2;

// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

// Use a copy function and a concatenation to form the word “торт” from parts of the word “информатика”.


public class Part3_2_String_Object_Ex4 {

    static void main(String[] args) {
        String oldWord = "информатика";
        String newWord;
        StringBuilder sbNewWord = new StringBuilder();

        char[] charsFromOldWord = oldWord.toCharArray();
        char charT = charsFromOldWord[oldWord.indexOf('т')];
        char charO = charsFromOldWord[oldWord.indexOf('о')];
        char charR = charsFromOldWord[oldWord.indexOf('р')];

        newWord = sbNewWord.append(charT).append(charO).append(charR).append(charT).toString();

        System.out.println("\nVar #1");
        System.out.println("Here is a " + newWord + " from " + oldWord);

        System.out.println("\nVar #2"); // Метод substring() возвращает подстроку строки между двумя индексами, или от одного индекса и до конца строки.
        String newWordV1 = oldWord.substring(7, 8) + oldWord.substring(3, 5) + oldWord.substring(7, 8);
        System.out.println("Here is a " + newWordV1 + " from " + oldWord);
    }
}
