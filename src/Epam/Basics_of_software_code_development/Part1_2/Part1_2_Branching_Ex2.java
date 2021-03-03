package Epam.Basics_of_software_code_development.Part1_2;

// Найти max{min(a, b), min(c, d)}.
// Find max{min(a, b), min(c, d)}.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1_2_Branching_Ex2 {
    public static void main(String[] args) {
        try {

            System.out.println("Enter the values for the variables \"a\", \"b\", \"c\" и \"d\".");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            int min1;
            int min2;
            int max;

            if (a < b) {
                min1 = a;
            } else {
                min1 = b;
            }
            if (c < d) {
                min2 = c;
            } else {
                min2 = d;
            }
            if (min1 > min2) {
                max = min1;
            } else max = min2;

            System.out.println("max{min(a, b), min(c, d)}=" + max);

        } catch (InputMismatchException ex) {
            System.out.println("Input error! " + ex.getMessage());
        }
    }
}
