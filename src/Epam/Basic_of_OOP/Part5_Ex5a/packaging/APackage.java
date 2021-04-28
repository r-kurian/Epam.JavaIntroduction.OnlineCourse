package Epam.Basic_of_OOP.Part5_Ex5a.packaging;

public abstract class APackage {
    private  String name;
    private double price;

    protected boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }

    public APackage(String name, double price) {
        if (price > 0 && isValidString(name)) {
            this.name = name;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return String.format("+ %1s %32s", name, Double.toString(price));
    }
}
