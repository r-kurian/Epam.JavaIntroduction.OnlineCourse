package Epam.Basic_of_OOP.Part5_Ex5a.flowers;

public class FlowerFactory {

    public Flower getFlower(EFlowerType type) {
        Flower toReturn = null;

        switch (type) {
            case PEONY -> toReturn = new Peony();
            case ROSE -> toReturn = new Rose();
            case TULIP -> toReturn = new Tulip();
        }

        return toReturn;
    }

    public Flower getFlower(EFlowerType type, String color, double price) {
        Flower toReturn = getFlower(type);

        if (toReturn != null) {
            toReturn.setColor(color);
            toReturn.setPrice(price);
        }

        return toReturn;
    }
}
