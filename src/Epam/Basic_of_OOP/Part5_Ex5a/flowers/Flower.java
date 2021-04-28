package Epam.Basic_of_OOP.Part5_Ex5a.flowers;

public class Flower implements IFlower {
    private String name = "ROSE";
    private String color = "red";
    private double price = 10.99;

    public Flower() {
    }

    protected boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }

    public Flower(String name, String color, double price) {
        if (price > 0 && isValidString(name) && isValidString(color)) {
            this.name = name;
            this.color = color;
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (isValidString(name)) {
            this.name = name;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (isValidString(color)) {
            this.color = color;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("%15s %15s %15s", name, color, Double.toString(price));
    }
}
