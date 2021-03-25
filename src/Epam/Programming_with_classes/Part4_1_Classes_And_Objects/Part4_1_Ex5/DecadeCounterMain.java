package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex5;

/*
Опишите класс, реализующий десятичный счетчик,
который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.

Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.

Счетчик имеет методы увеличения и уменьшения состояния,
и метод позволяющее получить его текущее состояние.

Написать код, демонстрирующий все возможности класса.
*/

/*
Write a decade counter class that can increment or decrement its value by one within a specified range.

Initialize the counter with default values and random values.

The counter has methods for increasing and decreasing current,
and a method for getting its current current.
*/

// cyclical decade counter (i.e. for such a counter 4-5 = 9 or 9 + 2 = 1)

import java.util.Scanner;

public class DecadeCounterMain {

    public static int min, max, current;

    public static boolean checkData(int min, int max) {
        if (min >= max) {
            System.out.println("Incorrect data: " +
                    "min value should be less than max value!");
            return false;
        }
        return true;
    }

    public static boolean checkData(int min, int max, int current) {
        if (current < min || current > max) {
            System.out.println("Incorrect data: " +
                    "current state should be between min and max value!");
            return false;
        }
        return true;
    }

    public static void getData(Scanner sc) {

        System.out.println("Enter min and max value:");
        min = sc.nextInt();
        max = sc.nextInt();
        while (!checkData(min, max)) {
            System.out.println("Try again!");
            min = sc.nextInt();
            max = sc.nextInt();
        }

        System.out.println("Would you like to enter current state? \nWen no, will be decrement return. \ny / n ");
        String s = sc.next();
        if (s.equals("y")) {
            System.out.println("Enter current state:");
            current = sc.nextInt();
            while (!checkData(min, max, current)) {
                System.out.println("Try again!");
                current = sc.nextInt();
            }
        } else
            current = min - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getData(sc);

        DecadeCounter counter;
        counter = (current < min) ? new DecadeCounter(min, max) : new DecadeCounter(min, max, current);
        System.out.print (counter.getCurrent());

        counter.incCurrent();
        System.out.print ("  " + counter.getCurrent());

        counter.decCurrent();
        System.out.print ("  " + counter.getCurrent());
    }
}

