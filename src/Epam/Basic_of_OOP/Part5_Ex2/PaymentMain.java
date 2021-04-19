package Epam.Basic_of_OOP.Part5_Ex2;

/* Create a Payment class with an inner class that can be used to create a purchase from several products.*/

/* Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaymentMain {

    public static void main(String[] args) {
        try {

            Payment payment = new Payment();

            System.out.println("How many products do you want to purchase? Enter an integer: ");
            Scanner sc = new Scanner(System.in);

            int scNumberOfProducts = sc.nextInt();

            if (scNumberOfProducts > 0) {
                Payment.addRandomProductsToList(scNumberOfProducts);
            } else {
                System.out.println("The numbers of products couldn't be smaller zero. Try again ");
            }

            System.out.println("Here is your products-list:");
            payment.print();
            payment.sumOfPurchaseAndVAT();
            payment.myCurrantDateAndTimeOfPurchase ();

            sc.close();

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
