package Epam.Basic_of_OOP.Part5_Ex5a.flowers;

public class Peony extends Flower implements IFlower {

    public Peony () {
        super();
        super.setName(String.valueOf(EFlowerType.PEONY));
        super.setPrice(7.59);
    }
}
