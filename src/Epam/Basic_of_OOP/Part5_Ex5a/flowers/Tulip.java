package Epam.Basic_of_OOP.Part5_Ex5a.flowers;

public class Tulip extends Flower implements IFlower {

    public Tulip() {
        super();
        super.setName(String.valueOf(EFlowerType.TULIP));
        super.setPrice(5.49);
    }
}
