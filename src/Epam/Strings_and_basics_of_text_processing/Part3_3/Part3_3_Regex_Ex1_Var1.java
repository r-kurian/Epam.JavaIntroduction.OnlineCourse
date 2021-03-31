package Epam.Strings_and_basics_of_text_processing.Part3_3;

/*
Создать приложение, разбирающее текст (хранится в строке) и позволяющее выполнять с текстом три различных операции:
1) отсортировать абзацы по количеству предложений; +
2) в каждом предложении отсортировать слова по длине;
3) отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
а в случае равенства – по алфавиту.


Create an application that parses the text (stored as a string)
and allows you to perform three different operations on the text:
1) sort paragraphs by the number of sentences;
2) sort words by a length in each sentence;
3) sort lexemes in a sentence in descending order of the number of occurrences of a given character,
and in case of equality, alphabetically.
*/

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Part3_3_Regex_Ex1_Var1 {

    private static final String PARAGRAPH_SPLIT_REGEX = "(?m)(?!\\A)(?=\\s{4})";
    private static final String SENTENCE_SPLIT_REGEX = "(?<=\\.|\\?)\\s(?=[A-Z])";

    // разделяет весь текст на параграфы
    static String[] paragraphSplit(String myStringFromFile) {
        return myStringFromFile.split(PARAGRAPH_SPLIT_REGEX);
    }

    // разделяет параграфы на предложения
    static String[] sentenceSplit(String paragraphString) {
        return paragraphString.split(SENTENCE_SPLIT_REGEX);
    }

    // считает кол-во параграфов
    static int getParagraphNumber(String[] paragraphArray) {
        int countArraysInText = 0;
        for (String s : paragraphArray) {
            countArraysInText++;
        }
        return countArraysInText;
    }

    // сортирует все абзацы по кол-ву предложений (задача №1)
    public static String[] textSortedDueToSizeOfParagraphs(String[] paragraphArray) {
        int[] lengthSentences = new int[paragraphArray.length];
        String[] forParagraphSort = new String[paragraphArray.length];

        for (int i = 0; i < paragraphArray.length; i++) {
            String[] sentence = sentenceSplit(paragraphArray[i]);
            lengthSentences[i] = sentence.length;
        }

        for (int i = 0; i < paragraphArray.length; i++) {
            int count = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < lengthSentences.length; j++) {
                if (count > lengthSentences[j] && lengthSentences[j] != 0) {
                    count = lengthSentences[j];
                    index = j;
                }
            }
            lengthSentences[index] = 0;
            forParagraphSort[i] = paragraphArray[index];
        }
        return forParagraphSort;
    }

    // ВО ВСЕХ ПРЕДЛОЖЕНИЯХ СОРТИРУЕТ СЛОВА ПО ДЛИНЕ
    public static List<String[]> wordSort(String[] sentence) {
        List<String[]> listSentences = new ArrayList<>();

        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        for (int i = 0; i < sentence.length; i++) {
            listSentences.add(sentence[i].split("\\s"));
        }

        for (String[] s : listSentences) {
            Arrays.sort(s, comparator);
            System.out.print(Arrays.toString(s));
        }
        System.out.println();
        return listSentences;
    }

    // driver code
    public static void main(String[] args) throws IOException {

        System.out.println("Enter your file path:"); // C:\Users\Roman\Desktop\java.txt

        Scanner scannerForPath = new Scanner(System.in);
        String myPathScanner = scannerForPath.nextLine();

        Scanner scannerForFile = new Scanner(new File(myPathScanner));
        String myStringFromFile = scannerForFile.useDelimiter("\\A").next(); // получить весь текст из файла в строке
        scannerForFile.close();

        // создание всяких сущностей
        String[] paragraphArray = paragraphSplit(myStringFromFile); // загнать файл-строку в массив
        String paragraphString = paragraphArray.toString();
        String[] task1 = textSortedDueToSizeOfParagraphs(paragraphArray);

        String[] paragraphSort = sentenceSplit(paragraphString);

        int countArraysInText = getParagraphNumber(paragraphArray); // печать кол-ва параграфов
        System.out.println("\n >>> Your text consists of " + countArraysInText + " PARAGRAPHS"); //

        Scanner scannerForPrinting = new Scanner(System.in); // сканнер для выбора Да/нет

        // ПЕЧАТЬ КОНКРЕТНОГО ПАРАГРАФА
        System.out.println("\n >>> Enter 1 if you want to PRINT some PARAGRAPH. Enter 0 to skip: ");
        int printSomeParagraph = scannerForPrinting.nextInt();
        if (printSomeParagraph == 1) { // если 1 - то переход к печети конкретного параграфа; если 0 - пропустить ход

            System.out.println("\n >>> Enter the number of PARAGRAPH you want to PRINT (from 1 to " + countArraysInText + " ):");
            int myNumOfParagraphToPrint = scannerForPrinting.nextInt(); // печать конкретного параграфа по номеру
            if (myNumOfParagraphToPrint >= 0 || myNumOfParagraphToPrint <= countArraysInText) {
                System.out.println(paragraphArray[myNumOfParagraphToPrint - 1]);
            }
        }

        // СОРТИРОВКА ВСЕГО ТЕКСТА ПО КОЛ-ВУ ПРЕДЛОЖЕНИЙ В АБЗАЦАХ (ЗАДЧА №1)
        System.out.println("\n >>> Enter 1 if you want to SORT all TEXT due to size of PARAGRAPH. Enter 0 to skip: ");
        int printSortedParagraphs = scannerForPrinting.nextInt();
        if (printSortedParagraphs == 1) { // если 1 - то переход к сортировке; если 0 - пропустить ход
            System.out.println(Arrays.toString(task1));
        }

        // В КАЖДОМ ПРЕДЛОЖЕНИИ ОТСОРТИРОВАТЬ СЛОВА ПО ДЛИНЕ (ЗАДАЧА №2);
        System.out.println("\n >>> Enter 1 to SORT WORDS. Enter 0 to skip: ");
        int printETWAS = scannerForPrinting.nextInt();
        if (printETWAS == 1) {
            System.out.println(wordSort(task1));
        }
    }
}