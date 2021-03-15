package Epam.Algorithmization.Part2_4;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

// Find the sum of the factorials of all odd numbers from 1 to 9.

/*
Факториал числа — это произведение натуральных чисел от 1 до самого числа (включая данное число).
Обозначается факториал восклицательным знаком «!»
*/

public class Part2_4_Decomposition_Ex7 {

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static void sumOfOddFactorials() {
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) { // odd numbers
            sum = sum + factorial(i);
            System.out.println("Factorial " + i + "! = " + factorial(i));
        }
        System.out.println("\nSum of odd factorials from 1 to 9 = " + sum);
    }

    public static void main(String[] args) {

        sumOfOddFactorials();
    }
}
