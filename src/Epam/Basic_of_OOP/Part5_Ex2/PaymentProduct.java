package Epam.Basic_of_OOP.Part5_Ex2;

public class PaymentProduct {

    private String name;
    private double price;

    public PaymentProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public PaymentProduct() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "\nProduct Name: " + name +
                ",      Price = " + price;
    }
}

