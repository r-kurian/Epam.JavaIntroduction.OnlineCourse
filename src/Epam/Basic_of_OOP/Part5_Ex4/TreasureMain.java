package Epam.Basic_of_OOP.Part5_Ex4;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class TreasureMain {

    public static void main(String[] args) {

        try {

            System.out.println("The dragon Smaug has collected a lot of treasure in his cave. " +
                    "If you are brave enough, use MENU to sort or find the following Information: ");
            DragonCave smaugCave = new DragonCave();

            smaugCave.generatorOfTreasure();

            System.out.println("""
                    Enter: \s
                     1 to view all list of treasures;         2 to find the most precious treasure;
                     3 to sort by price (min -> max);         4 to sort by price (max -> min);
                     5 to select treasures in a given amount;
                     0 to leave the cave """);

            Scanner sc = new Scanner(System.in);
            int menuPoint = sc.nextInt();

            switch (menuPoint) {
                case (1):
                    System.out.println("\nThe list of treasures");
                    smaugCave.showTreasure();
                    break;
                case (2):
                    System.out.println("\nThe most precious treasure");
                    smaugCave.findTheMostExpensiveTreasure();
                    break;
                case (3):
                    System.out.println("\nSort by price in increasing order (min -> max); ");
                    smaugCave.sortTreasuresInIncreasingOrder();
                    break;
                case (4):
                    System.out.println("\nSort by price in decreasing order (max -> min); ");
                    smaugCave.sortTreasuresInDecreasingOrder();
                    break;
                case (5):
                    System.out.println("\nSelect treasures for a given amount");
                    System.out.println("Enter your amount:");
                    int myAmount = sc.nextInt();
                    smaugCave.findTreasuresForGivenAmount(myAmount);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }

        } catch (IllegalArgumentException |
                InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
