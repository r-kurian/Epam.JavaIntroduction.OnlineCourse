package Epam.Basic_of_OOP.Part5_Ex2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Payment {

    public static PaymentProduct[] productList;

    public Payment() {
    }

    public Payment(PaymentProduct[] productList) {
        Payment.productList = productList;
    }

    public static void addRandomProductsToList(int scNumberOfProducts) {
        if (scNumberOfProducts > 0) {
            productList = new PaymentProduct[scNumberOfProducts];

            for (int i = 0; i < scNumberOfProducts; ++i)

                productList[i] = new PaymentProduct(
                        getRandomNameOfProduct(),
                        getRandomPriceOfProduct());
        } else {
            System.out.println("The numbers of products couldn't be smaller zero. Try again ");
        }
    }

    private static final String[] randomNameOfProductArray = {"Rice", "Beans", "Tuna", "Soup",
            "Chicken", "Eggs", "Canned meat", "Popcorn", "Potato chips", "Chocolate", "Ice cream", "Apples", "Bananas",
            "Papayas", "Celery", "Milk", "Water", "Kombucha", "Soft drinks", "Beer"};

    public static String getRandomNameOfProduct() {
        Random randomName = new Random();
        return randomNameOfProductArray[randomName.nextInt(randomNameOfProductArray.length)];
    }

    public static double getRandomPriceOfProduct() {
        Random randomPrice = new Random();
        return randomPrice.nextInt(500); // 1-500
    }

    public void sumOfPurchaseAndVAT() {
        double sum = 0;
        if (productList != null) {
            for (PaymentProduct product : productList) {
                sum += product.getPrice();
            }
            double vat = (sum / 100) * 7;
            System.out.println("\nThe sum of your purchase = " + sum);
            System.out.print("7% VAT of your order = ");
            System.out.printf("%.2f",vat);


        } else {
            System.out.println("The numbers of products couldn't be smaller zero. Try again ");
        }
    }

    public void myCurrantDateAndTimeOfPurchase() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("\n\nTime Of Purchase: " + formatter.format(date));
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return Arrays.toString(productList);
    }
}
