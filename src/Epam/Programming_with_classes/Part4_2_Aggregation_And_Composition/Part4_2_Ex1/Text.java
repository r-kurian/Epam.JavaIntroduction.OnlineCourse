package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex1;

/*
Create an object of the Text class using the Sentence, Word classes.
Methods: add text, display text to console, text title.
*/

public class Text {

    private String header;
    private String body= "";

    public Text(Word word) {
        header = word.getWord();
    }

    public Text(Sentence sentence) {
        header = sentence.getSentence();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getWord();
    }

    public void addBody(Sentence sentence) {
                body += " " + sentence.getSentence();
    }
    public String getBody() {
        return body;
    }
}
