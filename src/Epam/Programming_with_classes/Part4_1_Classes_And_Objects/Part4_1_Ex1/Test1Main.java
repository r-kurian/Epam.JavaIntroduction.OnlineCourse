package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
и методы изменения этих переменных. Добавьте метод, который находит сумму значений
этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

Create class Test1 with two variables.
1) Add a display method and methods for modifying these variables.
2) Add a method that finds the sum of the values of these variables,
3) and a method that finds the largest value of these two variables.
*/

public class Test1Main {

    public static void main(String[] args) {
        try {

            Test1 objectTest1 = new Test1();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two integers, the values of variables: ");

            objectTest1.setVar1(sc.nextInt());
            objectTest1.setVar2(sc.nextInt());

            System.out.println("\nHere are your assigned values of two variables: ");
            objectTest1.printVars();

            System.out.println("\nThe sum of two variables = " + objectTest1.sumOfVars());
            System.out.println("\nMax of two variables = " + objectTest1.returnMax());

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
