package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex5;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
*/

/*
Tourist vouchers. Create a pool of a tourist voucher of various types (excursions, shopping, cruise, etc.).
Consider the choice of transport, food and the number of days. Implement the selection and sorting of tours.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class TourScannerMain {

    public static void main(String[] args) {
        try {

            System.out.println("Generate some number of tours. Enter an integer: ");
            Scanner sc = new Scanner(System.in);

            int scNumberOfTours = sc.nextInt();
            if (scNumberOfTours > 0) {
                TourPackageGenerator.addToursToArray(scNumberOfTours); // just invisibly creates an array of tours.
            } else
                System.out.println("The numbers of tours couldn't be smaller zero. Try again ");

            System.out.println("""
                    Your tour list has been generated. Do you want to print it?
                    Enter y / n :\s""");
            String answerYesOrNo = sc.next();
            if (answerYesOrNo.equals("y")) {
                System.out.println("Here is your tour list:");
                TourPackageGenerator.printToursArray();
            }

            System.out.println("\n" +
                    "Use MENU to sort or find the following Information:\n" +
                    "Enter:  \n" +
                    " 1 to sort by County (A->Z);              2 to find by given County;\n" +
                    " 3 to sort by Price (min->max);           4 to find by given Price;\n" +
                    " 5 to sort by number of Days;             6 to find by given number of Days;\n" +
                    " 7 to sort by type of Food;               8 to find by given type of Food;\n" +
                    " 9 to sort by type of Room;               10 to find by given type of Room;\n" +
                    " 11 to sort by type of Transport;         12 to find by given type of Transport;\n" +
                    "                                          13 to find by given tour-ID.");

            int menuPoint = sc.nextInt();
            switch (menuPoint) {
                case 1 -> {
                    System.out.println("\nSorted by a County (A-Z) and Price (min->max) ");
                    TourPackageFilter.sortByCountry(TourPackageGenerator.toursArray);
                }
                case 2 -> {
                    System.out.println("\nEnter the Country of your travel:");
                    String myCountry = sc.next();

                    System.out.println("\nFiltered by the Country-Name");
                    TourPackageFilter.filterByMyCountry(myCountry, TourPackageGenerator.toursArray);
                }
                case 3 -> {
                    System.out.println("\nSorted by Price (min->max) and Days in tour");
                    TourPackageFilter.sortByPrice(TourPackageGenerator.toursArray);
                }
                case 4 -> {
                    System.out.println("\nEnter your Price:");
                    int myPrice = sc.nextInt();

                    System.out.println("\nThe Prices from the minimum up to given by you Price:");
                    TourPackageFilter.filterByPrice(myPrice, TourPackageGenerator.toursArray);
                }
                case 5 -> {
                    System.out.println("\nSorted by Days in tour and Price (min->max)");
                    TourPackageFilter.sortByDays(TourPackageGenerator.toursArray);
                }
                case 6 -> {
                    System.out.println("\nEnter the number of Days in a tour (from 1 to 4 weeks):");
                    int myDays = sc.nextInt();

                    System.out.println("\nThe number of Days in a tour. From the minimum up to given by you number:");
                    TourPackageFilter.filterByDays(myDays, TourPackageGenerator.toursArray);
                }
                case 7 -> {
                    System.out.println("\nSorted by type of Food");
                    TourPackageFilter.sortByTypeOfFood(TourPackageGenerator.toursArray);
                }
                case 8 -> {
                    System.out.println("\nEnter the type of Food. " +
                            "Use just such types as \"RO\", \"BB\", \"HB\", \"FB\", \"AI\", \"UAI\":");
                    String myTypeOfFood = sc.next();

                    System.out.println("\nTours with " + myTypeOfFood + " type of Food:");
                    TourPackageFilter.filterByTypeOfFood(myTypeOfFood, TourPackageGenerator.toursArray);
                }
                case 9 -> {
                    System.out.println("\nSorted by type of Room");
                    TourPackageFilter.sortByTypeOfRoom(TourPackageGenerator.toursArray);
                }
                case 10 -> {
                    System.out.println("\nEnter the type of Room. " +
                            "Use just such types as \"SGL\", \"DBL\", \"TRPL\", \"ExB\", \"Suite\":");
                    String myTypeOfRoom = sc.next();

                    System.out.println("\nTours with " + myTypeOfRoom + " type of Room:");
                    TourPackageFilter.filterByTypeOfRoom(myTypeOfRoom, TourPackageGenerator.toursArray);
                }
                case 11 -> {
                    System.out.println("\nSorted by type of Transport");
                    TourPackageFilter.sortByTypeOfTransport(TourPackageGenerator.toursArray);
                }
                case 12 -> {
                    System.out.println("\nEnter the type of Transport. " +
                            "Use just such types as \"Bus\", \"Plane\", \"Train\", \"Ship\":");
                    String myTypeOfTransport = sc.next();

                    System.out.println("\nTours with " + myTypeOfTransport + " type of Transport:");
                    TourPackageFilter.filterByTypeOfTransport(myTypeOfTransport, TourPackageGenerator.toursArray);
                }
                case 13 -> {
                    System.out.println("\nEnter the ID number of tour: ");
                    int idOfTour = sc.nextInt();

                    System.out.println("\nTour with ID:" + idOfTour + " number:");
                    TourPackageFilter.filterByIdOfTour(idOfTour, TourPackageGenerator.toursArray);
                }
                default -> System.out.println("Enter the number only from menu options, namely from 1 to 13.\n");
            }
        } catch (IllegalArgumentException |
                InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}