package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex2;

/*
Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.

Create class Test2 with two variables.
1) Add a constructor with input parameters.
2) Add a constructor that initializes the default class members.
3) Add set- and get- methods for the fields of the class instance.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2Main {

    public static void main(String[] args) {
        try {

            Test2 objectTest2 = new Test2();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two integers, the values of variables: ");

            objectTest2.setVar1(sc.nextInt());
            objectTest2.setVar2(sc.nextInt());

            System.out.println("\nHere are your assigned values of two variables: ");
            System.out.println("First variable = " + objectTest2.getVar1()
                    + ", second variable = " + objectTest2.getVar2());


        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
