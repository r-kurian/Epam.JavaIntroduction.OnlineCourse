package Epam.Basic_of_OOP.Part5_Ex1;

/*
Create an object of the Text File class using the classes of File and Directory.
Use methods: create, rename, display content to the console, add, delete.
*/

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
*/


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File directory = new File("C:\\Users\\Roman\\Desktop", "myFolder");

        Directory.createFolder(directory);

        Directory.getAllFoldersInDirectory(directory);

        File file = new File("C:\\Users\\Roman\\Desktop\\myFolder\\myFile.txt");

        TextFile.createFile(file);

        System.out.println("The text in your file:");
        TextFile.addText("\"The only true wisdom is in knowing you know nothing.\" ― Socrates");

        TextFile.getContent();

        TextFile.printInfoAboutFile(file);

        TextFile.renameFile();

        System.out.println("Do you want to delete the Folder? Enter y / n");
        Scanner sc = new Scanner(System.in);
        String answerYesOrNo = sc.next();
        if (answerYesOrNo.equals("y")) {
            Directory.deleteDirectory(directory);
            System.out.println("All files and the folder were deleted");
        } else {
            System.out.println("Thank you!");
        }
    }
}
