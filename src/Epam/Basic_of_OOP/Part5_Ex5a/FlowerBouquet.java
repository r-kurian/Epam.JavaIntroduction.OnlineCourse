package Epam.Basic_of_OOP.Part5_Ex5a;

import Epam.Basic_of_OOP.Part5_Ex5a.flowers.EFlowerType;
import Epam.Basic_of_OOP.Part5_Ex5a.flowers.Flower;
import Epam.Basic_of_OOP.Part5_Ex5a.flowers.FlowerFactory;
import Epam.Basic_of_OOP.Part5_Ex5a.packaging.APackage;
import Epam.Basic_of_OOP.Part5_Ex5a.packaging.PackageBig;
import Epam.Basic_of_OOP.Part5_Ex5a.packaging.PackageMedium;
import Epam.Basic_of_OOP.Part5_Ex5a.packaging.PackageSmall;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;


public class FlowerBouquet {

    private final ArrayList<Flower> flowerList = new ArrayList<Flower>();
    private final FlowerFactory factory = new FlowerFactory();
    private APackage suitablePackage;

    public FlowerBouquet() {
    }

    public void addRandomFlower(int num) {
        while (num-- > 0) {
            Random random = new Random();
            EFlowerType type = EFlowerType.values()[random.nextInt(EFlowerType.values().length)];
            flowerList.add(factory.getFlower(type));
        }
    }

    public APackage addSuitablePackage() { //small = up to 7 flowers, medium = up to 13, else - big size
        if (flowerList.size() <= 7) {
            return suitablePackage = new PackageSmall();
        } else if (flowerList.size() <= 13) {
            return suitablePackage = new PackageMedium();
        } else {
            return suitablePackage = new PackageBig();
        }
    }

    public void addPeony(int num, String color, double price) {
        while (num-- > 0) {
            flowerList.add(factory.getFlower(EFlowerType.PEONY, color, price));
        }
    }

    public void addRose(int num, String color, double price) {
        while (num-- > 0) {
            flowerList.add(factory.getFlower(EFlowerType.ROSE, color, price));
        }
    }

    public void addTulip(int num, String color, double price) {
        while (num-- > 0) {
            flowerList.add(factory.getFlower(EFlowerType.TULIP, color, price));
        }
    }


    protected boolean isValidString(String myTypeOfFlowers) {
        return myTypeOfFlowers != null && !myTypeOfFlowers.isEmpty();
    }

    public void removeAllSameTypeFlowers(String myTypeOfFlowers) {

        String myTypeOfFlowersUpperCase = myTypeOfFlowers.toUpperCase();

        if (myTypeOfFlowersUpperCase.equals("PEONY")
                || myTypeOfFlowersUpperCase.equals("ROSE")
                || myTypeOfFlowersUpperCase.equals("TULIP")
                && isValidString(myTypeOfFlowers)) {
            flowerList.removeIf(x -> x.getName().equals(myTypeOfFlowersUpperCase));
        } else {
            System.out.println("\nInvalid value. Choose a type of flowers from the following: PEONY, ROSE or TULIP");
        }
    }

    public double getTotalPriceOfBouquet() {
        double price = 0;

        for (Flower flower : flowerList) {
            price += flower.getPrice();
        }

        double totalPrice = price + suitablePackage.getPrice();

        return Math.round(totalPrice * 100d) / 100d;
    }


    public void sortBouquetByColor() {
        Comparator<Flower> byColor = Comparator.comparing(Flower::getColor).thenComparing(Flower::getName);
        flowerList.sort(byColor);
    }

    public void printMyBouquet() {
        System.out.println(String.format("%17s %15s %15s", "Flower", "Color", "PPU"));
        System.out.println("*************************************************");
        System.out.println(toString());
        System.out.println("*************************************************");
        System.out.println("TOTAL AMOUNT: " + getTotalPriceOfBouquet());
    }

    @Override
    public String toString() {
        StringBuilder stringToPrint = new StringBuilder();

        for (int i = 0; i < flowerList.size(); i++) {
            if (i < 9) {
                String iPlusZeroFormat = Integer.toString(i + 1);
                stringToPrint.append("0").append(iPlusZeroFormat).append(flowerList.get(i).toString()).append("\n");
            } else {
                stringToPrint.append(i + 1).append(flowerList.get(i).toString()).append("\n");
            }
        }
        stringToPrint.append(suitablePackage.toString());

        return stringToPrint.toString();

    }
}