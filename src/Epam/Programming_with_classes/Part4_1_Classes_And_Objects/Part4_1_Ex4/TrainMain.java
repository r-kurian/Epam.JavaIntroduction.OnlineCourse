package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex4;

/*
Создайте класс Train, содержащий поля:
- название пункта назначения,
- номер поезда,
- время отправления.

Создайте данные в массив из пяти элементов типа Train,
добавьте возможность сортировки элементов массива по номерам поездов.

Добавьте возможность вывода информации о поезде, номер которого введен пользователем.

Добавьте возможность сортировки массив по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

/*
Create a Train class containing the following fields:
- the name of the destination,
- train number,
- departure time.

Create an array of five elements of the Train type,
add the ability to sort the array elements by train numbers.

Add the ability to display information about the train by the entered number of the train.

Add the ability to sort the array by destination,
where trains with the same destination must be sorted by departure time.
*/

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TrainMain {

    public static Train[] trainsArray = new Train[5];

    public static void fillInArray() {
        trainsArray[0] = new Train("Berlin", 11, LocalDateTime.of(2021, Month.JUNE, 10, 10, 0));
        trainsArray[1] = new Train("Hamburg", 21, LocalDateTime.of(2021, Month.JUNE, 10, 10, 0));
        trainsArray[2] = new Train("Munich", 89, LocalDateTime.of(2021, Month.JUNE, 10, 12, 0));
        trainsArray[3] = new Train("Hamburg", 75, LocalDateTime.of(2021, Month.JUNE, 10, 11, 0));
        trainsArray[4] = new Train("Munich", 89, LocalDateTime.of(2021, Month.JUNE, 10, 11, 0));
    }

    // sorts first Numbers than Destinations
    public static void sortByNumbers(Train[] trainsArray) {
        System.out.println("\n---> All trains sorted by the TRAIN-NUMBER: ");

        Comparator<Train> numbAndDest = Comparator.comparing(Train::getNumberOfTrain).thenComparing(Train::getDestination);
        Arrays.stream(trainsArray)
                .sorted(numbAndDest)
                .forEach(System.out::println);

    }

    // sorts first Destinations than Departure Time
    public static void sortByDestination(Train[] trainsArray) {
        System.out.println("\n---> All trains sorted by the DESTINATION: ");

        Comparator<Train> destAndTime = Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime);
        Arrays.stream(trainsArray)
                .sorted(destAndTime)
                .forEach(System.out::println);
    }

    // print Train by Number
    public static void findTrainByNumber() {
        System.out.println("\n---> Enter your needed train-number: ");
        Scanner scMyNumOfTrain = new Scanner(System.in);
        int myNumOfTrain = scMyNumOfTrain.nextInt();
        Train myTrain = null;

        do {
            for (Train train : trainsArray) {
                if (train.getNumberOfTrain() == myNumOfTrain)
                    myTrain = train;
            }
            assert myTrain != null;
            System.out.println("\nThe Info about the train #" + myNumOfTrain + ":" + "\n" + myTrain.toString());
        } while (myNumOfTrain <= 0);
    }

    public static void main(String[] args) {
        fillInArray();

        System.out.println("Select an action from the menu: ");
        System.out.println("Enter 1 to sort all trains by the train-number; ");
        System.out.println("Enter 2 to sort all trains by the destination;");
        System.out.println("Enter 3 to print Info on a train-number;");
        System.out.println("0 - EXIT ");

        try {

            Scanner scMyNumForMenu = new Scanner(System.in);
            int myNumForMenu = scMyNumForMenu.nextInt();

            switch (myNumForMenu) {
                case 1 -> sortByNumbers(trainsArray);
                case 2 -> sortByDestination(trainsArray);
                case 3 -> findTrainByNumber();
                case 0 -> System.exit(0);
                default -> System.out.println("Enter the number only from menu options, namely 1, 2 or 3.\n");
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
