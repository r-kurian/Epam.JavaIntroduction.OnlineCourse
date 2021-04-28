package Epam.Basic_of_OOP.Part5_Ex5a;

/* Create an application that creates a flower bouquet (an object that represents a flower arrangement).
Flowers and packages are the components of the bouquet.
*/


/*
Реализовать приложение, позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.

Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
*/

public class FlowerBouquetMain {

    public static void main(String[] args) {

        FlowerBouquet myBouquet = new FlowerBouquet();

        myBouquet.addRandomFlower(3);

        myBouquet.addPeony(3, "white", 8.99);
        myBouquet.addRose(3, "red", 12.99);
        myBouquet.addTulip(3, "yellow", 5.99);

        myBouquet.removeAllSameTypeFlowers("RoSe");

        myBouquet.sortBouquetByColor();

        myBouquet.addSuitablePackage();

        myBouquet.printMyBouquet();
    }
}
