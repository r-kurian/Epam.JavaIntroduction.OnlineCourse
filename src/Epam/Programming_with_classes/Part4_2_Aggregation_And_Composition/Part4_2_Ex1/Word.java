package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex1;

/*
Create an object of the Text class using the Sentence, Word classes.
Methods: add text, display text to console, text title.
*/

public class Word {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
