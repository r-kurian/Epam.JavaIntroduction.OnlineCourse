package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TourPackageFilter {

    // case 1 - sort by Country and Price
    public static void sortByCountry(TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available.");
        }

        Comparator<TourPackage> byCounty = Comparator.comparing(TourPackage::getCountry).thenComparing(TourPackage::getPrice);
        Arrays.stream(toursArray)
                .sorted(byCounty)
                .forEach(System.out::println);
    }

    // case 2 - filter by entered Country
    public static void filterByMyCountry(String myCountry, TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available. Try another Country.");
        }
        List<TourPackage> toursList = Arrays.asList(toursArray);
        toursList.stream()
                .filter(x -> myCountry.equals(x.getCountry()))
                .forEach(System.out::println);
    }

    // case 3 - sort by Price
    public static void sortByPrice(TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available.");
        }
        Comparator<TourPackage> byPrice = Comparator.comparing(TourPackage::getPrice).thenComparing(TourPackage::getDaysInTour);
        Arrays.stream(toursArray)
                .sorted(byPrice)
                .forEach(System.out::println);
    }

    // case 4 - filter by Price
    public static void filterByPrice(int myPrice, TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available. Try another Price.");
        }
        List<TourPackage> toursList = Arrays.asList(toursArray);
        toursList.stream()
                .filter(x -> x.getPrice() <= myPrice)
                .forEach(System.out::println);
    }

    // case 5 - sort by Days and Price
    public static void sortByDays(TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available.");
        }
        Comparator<TourPackage> byDays = Comparator.comparing(TourPackage::getDaysInTour).thenComparing(TourPackage::getPrice);
        Arrays.stream(toursArray)
                .sorted(byDays)
                .forEach(System.out::println);
    }

    // case 6 - filter by Days
    public static void filterByDays(int myDays, TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available. Try another number of Day.");
        }
        List<TourPackage> toursList = Arrays.asList(toursArray);
        toursList.stream()
                .filter(x -> x.getDaysInTour() <= myDays)
                .forEach(System.out::println);
    }

    // case 7 - sort by type of Food and Price
    public static void sortByTypeOfFood(TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available.");
        }
        Comparator<TourPackage> byTypeOfFood = Comparator.comparing(TourPackage::getTypeOfFood).thenComparing(TourPackage::getPrice);
        Arrays.stream(toursArray)
                .sorted(byTypeOfFood)
                .forEach(System.out::println);
    }

    // case 8 - filter by type of Food
    public static void filterByTypeOfFood(String myTypeOfFood, TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available. Try another type of Food.");
        }
        List<TourPackage> toursList = Arrays.asList(toursArray);
        toursList.stream()
                .filter(x -> myTypeOfFood.equals(x.getTypeOfFood()))
                .forEach(System.out::println);
    }


    // case 9 - sort by type of Room and Price
    public static void sortByTypeOfRoom(TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available.");
        }
        Comparator<TourPackage> byTypeOfRoom = Comparator.comparing(TourPackage::getTypeOfRoom).thenComparing(TourPackage::getPrice);
        Arrays.stream(toursArray)
                .sorted(byTypeOfRoom)
                .forEach(System.out::println);
    }

    // case 10 - filter by type of Room
    public static void filterByTypeOfRoom(String myTypeOfRoom, TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available. Try another type of Room.");
        }
        List<TourPackage> toursList = Arrays.asList(toursArray);
        toursList.stream()
                .filter(x -> myTypeOfRoom.equals(x.getTypeOfRoom()))
                .forEach(System.out::println);
    }

    // case 11 - sort by type of Transport and Price
    public static void sortByTypeOfTransport(TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available.");
        }
        Comparator<TourPackage> byTypeOfTransport = Comparator.comparing(TourPackage::getTransport).thenComparing(TourPackage::getPrice);
        Arrays.stream(toursArray)
                .sorted(byTypeOfTransport)
                .forEach(System.out::println);
    }

    // case 12 - filter by type of Transport
    public static void filterByTypeOfTransport(String myTypeOfTransport, TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available. Try another type of Transport.");
        }
        List<TourPackage> toursList = Arrays.asList(toursArray);
        toursList.stream()
                .filter(x -> myTypeOfTransport.equals(x.getTransport()))
                .forEach(System.out::println);
    }

    // case 13 - filter by ID-number
    public static void filterByIdOfTour(int idOfTour, TourPackage[] toursArray) {
        if (toursArray == null) {
            throw new IllegalArgumentException("No information available. Try another ID number.");
        }
        List<TourPackage> toursList = Arrays.asList(toursArray);
        toursList.stream()
                .filter(x -> x.getPrice() == idOfTour)
                .forEach(System.out::println);
    }
}

