package Epam.Basic_of_OOP.Part5_Ex5a.flowers;

public class Rose extends Flower implements IFlower{

   public Rose() {
        super();
        super.setName(String.valueOf(EFlowerType.ROSE));
        super.setPrice(10.99);
    }
}
