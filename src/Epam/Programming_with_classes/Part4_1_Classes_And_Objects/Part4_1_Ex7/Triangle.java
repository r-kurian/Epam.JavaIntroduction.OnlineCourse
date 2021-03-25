package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex7;

/*
Describe the class of the triangle.
Provide methods for creating objects, calculating the area, perimeter and intersection of the medians.
*/

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    void classifyingOfTriangle() {
        if (sideA > sideB + sideC) {
            System.out.println("\nSuch lengths can't form a triangle!");
        } else if (sideA == sideB && sideB == sideC) {
            System.out.println("\nEQUILATERAL Triangle"); // if all three sides have equal length (равнобедренный)
        } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
            System.out.println("\nEQUILATERAL Triangle"); // if two sides have equal length (равносторонний)
        } else {
            System.out.println("\nSCALENE Triangle"); // all sides different lengths, no right angles (разносторонний)
        }
    }

    public void printSidesOfTriangle() {
        System.out.println("\nThe Triangle Sides are: Side A: " + sideA + "; Side B: " + sideB + "; Side C: " + sideC);
    }

    public void printAreaOfTriangle() {
        System.out.println("\nThe Triangle's Area is " + (sideA + sideB + sideC) / 2);
    }

    public void printPerimeterOfTriangle() {
        System.out.println("\nThe Triangle's Perimeter is " + (sideA + sideB + sideC));
    }

    public void printMedianAndCentroidOfTriangle() {
        double medianBetweenAB = Math.sqrt(2 * Math.pow(sideA, 2) + 2 * Math.pow(sideB, 2) - Math.pow(sideC, 2)) / 2;
        double medianBetweenBC = Math.sqrt(2 * Math.pow(sideB, 2) + 2 * Math.pow(sideC, 2) - Math.pow(sideA, 2)) / 2;
        double medianBetweenAC = Math.sqrt(2 * Math.pow(sideA, 2) + 2 * Math.pow(sideC, 2) - Math.pow(sideB, 2)) / 2;

        System.out.println("\nThe medians of the triangle are:\nbetween the sides:"
                + "\nA-B: " + medianBetweenAB
                + "\nB-C: " + medianBetweenBC
                + "\nA-C: " + medianBetweenAC);

        System.out.println("\nThe centroid of the medians between the sides:"
                + "\nA-B: " + medianBetweenAB / 3 * 2
                + "\nB-C: " + medianBetweenBC / 3 * 2
                + "\nA-C: " + medianBetweenAC / 3 * 2);
    }

    public String toString() {
        return " Triangle: Side A = " + sideA + " Side B = " + sideB
                + " Side C = " + sideC;
    }
}
