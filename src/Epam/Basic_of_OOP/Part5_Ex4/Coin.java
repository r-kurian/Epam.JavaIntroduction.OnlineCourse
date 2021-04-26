package Epam.Basic_of_OOP.Part5_Ex4;

import java.util.Random;

public class Coin extends Treasure {

    private static final String[] nameOfCoinsArray = {"Escudo", "Peso", "Doubloon", "Pfennig", "Dinars", "Schilling", "Florin"};
    private static final int[] priceOfCoinsArray = {1, 2, 5, 10, 20, 25, 50, 100};

    public Coin(String name, double price) {
        super(name, price);
    }

    public static String getRandomNameOfCoins() {
        Random randomCoins = new Random();
        return nameOfCoinsArray[randomCoins.nextInt(nameOfCoinsArray.length)];
    }

    public static int getRandomPriceOfCoins() {
        Random randomCoins = new Random();
        return priceOfCoinsArray[randomCoins.nextInt(nameOfCoinsArray.length)];
    }

    @Override
    public String toString() {
        return "\nprice = " + getPrice() +
                ", " + getName() + " coin";
    }
}
