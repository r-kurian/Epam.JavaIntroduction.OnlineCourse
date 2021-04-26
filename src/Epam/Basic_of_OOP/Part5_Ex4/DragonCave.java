package Epam.Basic_of_OOP.Part5_Ex4;

import java.util.*;

public class DragonCave {

    private final List<Treasure> treasureList;

    public DragonCave() {
        treasureList = new ArrayList<>();
    }

    public void generatorOfTreasure() { // coins 50%, gems 20%, rings 10%, swords 10%, magic artifact 10%

        for (int i = 0; i < 100; i++) {

            if (i <= 50) { // 50%
                treasureList.add(new Coin(
                        Coin.getRandomNameOfCoins(),
                        Coin.getRandomPriceOfCoins()));

            } else if (51 < i && i <= 70) { //20%
                treasureList.add(new Gem(
                        Gem.getRandomNameOfGems(),
                        Gem.getRandomPriceOfGems()));

            } else if (71 < i && i <= 80) { //10%
                treasureList.add(new Ring(
                        Ring.getRandomNameOfRings(),
                        Ring.getRandomPriceOfRings()));

            } else if (81 < i && i <= 90) { //10%
                treasureList.add(new Sword(
                        Sword.getRandomNameOfSwords(),
                        Sword.getRandomPriceOfSwords()));

            } else { //10%
                treasureList.add(new MagicArtifact(
                        MagicArtifact.getRandomNameOfMagicArtifact(),
                        MagicArtifact.getRandomPriceOfMagicArtifact()));

            }
        }
    }

    public void findTheMostExpensiveTreasure() {
        double tmp = 0;
        for (Treasure x : treasureList) {
            if (tmp < x.getPrice()) {
                tmp = x.getPrice();
            }
        }
        for (Treasure x : treasureList) {
            if (tmp == x.getPrice()) {
                System.out.println(x);
            }
        }
    }

    public void sortTreasuresInIncreasingOrder() {
        Comparator<Treasure> byPrice = Comparator.comparing(Treasure::getPrice).thenComparing(Treasure::getName);
        treasureList.sort(byPrice);
        treasureList.forEach(System.out::print);
    }

    public void sortTreasuresInDecreasingOrder() {
        Comparator<Treasure> byPrice = Comparator.comparing(Treasure::getPrice).thenComparing(Treasure::getName);
        treasureList.sort(Collections.reverseOrder(byPrice));
        treasureList.forEach(System.out::print);
    }

    public void findTreasuresForGivenAmount(int myAmount) {
        List<Treasure> someTreasureForGivenAmount = new ArrayList<>();
        treasureList.stream().sorted((x, y) -> (int) y.getPrice() - (int) x.getPrice());
        double tmp = 0;
        for (Treasure x : treasureList) {
            if (x.getPrice() <= myAmount) {
                myAmount -= x.getPrice();
                someTreasureForGivenAmount.add(x);
                tmp = myAmount;
            }
            if (myAmount == 0) {
                break;
            }
        }
        someTreasureForGivenAmount.stream().forEach(System.out::print);
    }

    public void showTreasure() {
        treasureList.forEach(System.out::print);
    }

}
