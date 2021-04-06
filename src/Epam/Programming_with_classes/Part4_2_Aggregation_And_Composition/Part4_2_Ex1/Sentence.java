package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex1;

/*
Create an object of the Text class using the Sentence, Word classes.
Methods: add text, display text to console, text title.
*/

public class Sentence {

    private String sentence="";

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void addWord(Word word) {
        sentence += " " + word.getWord();
    }
}