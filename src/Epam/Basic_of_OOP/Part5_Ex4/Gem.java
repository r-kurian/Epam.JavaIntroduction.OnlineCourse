package Epam.Basic_of_OOP.Part5_Ex4;

import java.util.Random;

public class Gem extends Treasure {

    private static final String[] nameOfGemsArray = {"Emerald", "Ruby", "Diamond", "Aquamarine", "Topaz"};

    public Gem(String name, double price) {
        super(name, price);
    }

    public static String getRandomNameOfGems() {
        Random randomGems = new Random();
        return nameOfGemsArray[randomGems.nextInt(nameOfGemsArray.length)];
    }

    public static int getRandomPriceOfGems() {
        Random randomGems = new Random();
        return randomGems.nextInt(200) + 50; // 50-200
    }

    @Override
    public String toString() {
        return "\nprice = " + getPrice() +
                ", " + getName() + " gemstone";
    }
}
