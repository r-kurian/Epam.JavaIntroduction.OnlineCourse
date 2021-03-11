package Epam.Algorithmization.Part2_4;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние.
Указание. Координаты точек занести в массив.

Find, between which points n the greatest distance.
Tip: the points coordinates arranged in an array.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_4_Decomposition_Ex4 {

    static void generateAndPrintPointsArray(int[] x, int[] y, int n) {
        for (int i = 0; i < n; ++i) {
            x[i] = (int) (-50 + Math.random() * 100);
            y[i] = (int) (-50 + Math.random() * 100);
        }
        for (int i = 0; i < n; ++i)
            System.out.println(x[i] + " : " + y[i]);
    }

    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    static void findGreatestDistance(int[] x, int[] y) {
        int x1 = x[0], x2 = x[1], y1 = y[0], y2 = y[1];
        double res = distance(x1, y1, x2, y2);
        for (int i = 0; i < x.length - 1; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (distance(x[i], y[i], x[j], y[j]) > res) {
                    res = distance(x[i], y[i], x[j], y[j]);
                    x1 = x[i];
                    x2 = x[j];
                    y1 = y[i];
                    y2 = y[j];
                }
            }
        }
        System.out.println("(" + x1 + " : " + y1 + ") and (" + x2 + " : " + y2 + ")");
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;

            do {
                System.out.println("Enter positive integer n>1, the number of points:");
                n = sc.nextInt();
            } while (n < 2);

            int[] x = new int[n];
            int[] y = new int[n];

            System.out.println("\nYour points coordinates:");
            generateAndPrintPointsArray(x, y, n);

            System.out.println("\nThe greatest distance is between the following points:");
            findGreatestDistance(x, y);

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
