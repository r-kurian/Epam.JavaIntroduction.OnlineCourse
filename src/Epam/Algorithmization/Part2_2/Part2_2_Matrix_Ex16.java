package Epam.Algorithmization.Part2_2;

/*
Магическим квадратом порядка n называется квадратная матрица размера n x n,
составленная из чисел 1, 2, 3,...,n2 так, что суммы по каждому столбцу,
каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3 ниже:

Write a program that takes a number from the user and creates a magic square.
A magic square is one where the sum of each row, column, and diagonal is the same.
See the example below:

6 1 8
7 5 3
2 9 4
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2_2_Matrix_Ex16 {

    static void generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) // 3rd condition
            {
                j = n - 2;
                i = 0;
            } else {
                // 1st condition helper if next number
                // goes to out of square's right side
                if (j == n)
                    j = 0;

                // 1st condition helper if next number is
                // goes to out of square's upper side
                if (i < 0)
                    i = n - 1;
            }

            // 2nd condition
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                // set number
                magicSquare[i][j] = num++;

            // 1st condition
            j++;
            i--;
        }

        // print magic square

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(magicSquare[i][j] + "  ");
            System.out.println();
        }
    }

    // driver program
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n;

            do {
                System.out.println("Enter odd integers \"n\", the size of magic square:");
                n = sc.nextInt();
            } while (n <= 0 || n % 2 == 0);

            System.out.println("\nThe Magic Square for " + n + ":");
            generateMagicSquare(n);

            System.out.println("\nSum of each row or column " + n * (n * n + 1) / 2 + ":");

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
