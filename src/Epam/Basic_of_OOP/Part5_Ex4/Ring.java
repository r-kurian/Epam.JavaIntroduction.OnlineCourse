package Epam.Basic_of_OOP.Part5_Ex4;

import java.util.Random;

public class Ring extends Treasure {

    public static final String[] nameOfRingsArray = {"Golden", "Silver"};

    public Ring(String name, double price) {
        super(name, price);
    }

    public static String getRandomNameOfRings() {
        Random randomGems = new Random();
        return nameOfRingsArray[randomGems.nextInt(nameOfRingsArray.length)];
    }

    public static int getRandomPriceOfRings() {
        Random randomGems = new Random();
        return randomGems.nextInt(350) + 100;  // 100-350
    }

    @Override
    public String toString() {
        return "\nprice = " + getPrice() +
                ", " + getName() + " ring";
    }
}
