package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex1;

/*
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.

Create an object of the Text class using the Sentence, Word classes.
Methods: add text, display text to console, text title.
*/

/*Создать приложение, удовлетворяющее требованиям, приведенным в задании.
Аргументировать принадлежность классу каждого создаваемого метода и
корректно переопределить для каждого класса методы equals(), hashCode(), toString().

Глава 4, ст. 80, file:///C:/Users/Roman/Desktop/Java.Programming.pdf
 */

import Epam.Sandbox2.Sandbox2Sentence;
import Epam.Sandbox2.Sandbox2Word;

public class TextMain {

    public static void main(String[] args) {

        Word title = new Word("The Old Pond by Matsuo Basho");

        Text text = new Text(title);

        Word word1 = new Word("\nold");
        Word word2 = new Word("pond");
        Word word3 = new Word("\nfrog");
        Word word4 = new Word("leaping");
        Word word5 = new Word("\nsplash!");

        Sentence firstSentence = new Sentence();
        firstSentence.addWord(word1);
        firstSentence.addWord(word2);

        Sentence secondSentence = new Sentence();
        secondSentence.addWord(word3);
        secondSentence.addWord(word4);

        Sentence thirdSentence = new Sentence();
        thirdSentence.addWord(word5);

        text.addBody(firstSentence);
        text.addBody(secondSentence);
        text.addBody(thirdSentence);

        System.out.println(text.getHeader());
        System.out.println(text.getBody());
    }
}
