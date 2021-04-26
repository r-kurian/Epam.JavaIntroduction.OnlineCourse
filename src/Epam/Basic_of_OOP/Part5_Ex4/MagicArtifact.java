package Epam.Basic_of_OOP.Part5_Ex4;

import java.util.Random;

public class MagicArtifact extends Treasure {

    private static final String[] nameOfMagicArtifactArray = {"Lembas", "Elven Cloaks", "Eärendil", "Palantir",
            "Andúril", "Mithril Vest", "Evenstar", "Phial of Galadriel"};

    public MagicArtifact(String name, double price) {
        super(name, price);
    }

    public static String getRandomNameOfMagicArtifact() {
        Random randomGems = new Random();
        return nameOfMagicArtifactArray[randomGems.nextInt(nameOfMagicArtifactArray.length)];

    }

    public static int getRandomPriceOfMagicArtifact() {
        Random randomGems = new Random();
        return randomGems.nextInt(600) + 300;  // 300-600
    }

    @Override
    public String toString() {
        return "\nprice = " + getPrice() +
                ", " + getName();
    }
}
