package Epam.Strings_and_basics_of_text_processing.Part3_1;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

// Given an array with camelCase names of variables. Convert names into snake_case.

import java.util.Scanner;

public class Part3_1_String_Array_Ex1 {

    public static void main(String[] args) {

        System.out.println("Enter some word in CamelCase:");

        Scanner sc = new Scanner(System.in);
        String name2 = sc.nextLine();

        String name1 = "hereIsYourWordInCamelCase:";

        String[] arrayCamelCase = {name1, name2};

        System.out.println();
        for (String s : arrayCamelCase) { // печать CamelCase-примера
            System.out.print(s + " ");
        }
        System.out.println();
        arrayCamelCase[0] = "hereIsYourWordInSnakeCase:"; // переопределение элемента поз. "0"

        for (int i = 0; i < arrayCamelCase.length; ++i) {
            StringBuilder temp = new StringBuilder();

            for (int j = 0; j < arrayCamelCase[i].length(); ++j) {
                if (Character.isUpperCase(arrayCamelCase[i].charAt(j))) {
                    temp.append("_");
                    temp.append(Character.toLowerCase(arrayCamelCase[i].charAt(j)));
                } else
                    temp.append(arrayCamelCase[i].charAt(j));
            }
            arrayCamelCase[i] = temp.toString();
        }

        System.out.println();
        for (String s : arrayCamelCase) { // печать snake_case-примера
            System.out.print(s + " ");
        }
    }
}
