package Epam.Basic_of_OOP.Part5_Ex4;

import java.util.Random;

public class Sword extends Treasure {

    private static final String[] firstNameOfSwordArray = {"Elvens", "Goblins", "Orcs", "Mens", "Dwarves", "Hobbits", "Maiars"};
    private static final String[] secondNameOfSwordArray = {"two-handed sword", "long sword", "short sword", "dagger", "backsword"};

    public Sword(String name, double price) {
        super(name, price);
    }

    public static String getRandomNameOfSwords() {
        Random randomSwords = new Random();
        return firstNameOfSwordArray[randomSwords.nextInt(firstNameOfSwordArray.length)] + " " +
                secondNameOfSwordArray[randomSwords.nextInt(secondNameOfSwordArray.length)];

    }

    public static int getRandomPriceOfSwords() {
        Random randomSwords = new Random();
        return randomSwords.nextInt(550) + 100;  // 100-550
    }

    @Override
    public String toString() {
        return "\nprice = " + getPrice() +
                ", " + getName();
    }

}
