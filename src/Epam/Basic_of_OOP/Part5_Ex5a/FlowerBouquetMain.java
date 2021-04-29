package Epam.Basic_of_OOP.Part5_Ex5a;

/* Create an application that creates a flower bouquet (an object that represents a flower arrangement).
Flowers and packages are the components of the bouquet.

 In your application you should meet the following requirements:
• Correctly design and implement the problem domain.
• Consider using generative design patterns to create objects from a class hierarchy.
• Implement user input validation, but not client-side.
• Regular expressions can be used to check the correctness of the transmitted data.
• The menu for selecting an action by the user can be omitted, use a stub.
• Special Condition: Override the toString (), equals (), and hashCode () methods where necessary.
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
