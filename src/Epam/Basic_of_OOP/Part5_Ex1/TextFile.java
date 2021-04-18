package Epam.Basic_of_OOP.Part5_Ex1;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TextFile extends java.io.File {

    public TextFile(@NotNull String pathname) {
        super(pathname);
    }

    public TextFile(String parent, @NotNull String child) {
        super(parent, child);
    }

    private Directory directory;
    private static TextFile file;

    public TextFile(@NotNull String pathname, Directory directory, TextFile file) {
        super(pathname);
        this.directory = directory;
        TextFile.file = file;
    }

    public TextFile(String parent, @NotNull String child, Directory directory, TextFile file) {
        super(parent, child);
        this.directory = directory;
        TextFile.file = file;
    }

    public TextFile(File parent, @NotNull String child, Directory directory, TextFile file) {
        super(parent, child);
        this.directory = directory;
        TextFile.file = file;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public void setFile(TextFile file) {
        TextFile.file = file;
    }

    public static File getFile() {
        return file;
    }

    public static void printInfoAboutFile(File file) {
        System.out.println("File name: " + file.getName());
        System.out.println("Parent folder: " + file.getParent());
        System.out.println("File size: " + file.length() + " bite");
    }

    public static void createFile(File file) {
        try {
            boolean created = file.createNewFile();
            if (created)
                System.out.println("File has been created successfully");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void addText(String line) {
        try {
            Files.write(Paths.get("C:\\Users\\Roman\\Desktop\\myFolder\\myFile.txt"), line.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }

    public static void getContent() {
        try {
            FileReader reader = new FileReader("C:\\Users\\Roman\\Desktop\\myFolder\\myFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void renameFile() {
        File oldFile = new File("C:\\Users\\Roman\\Desktop\\myFolder\\myFile.txt");
        File newFile = new File("C:\\Users\\Roman\\Desktop\\myFolder\\myNEW!File.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed into: " + newFile.getName());
        } else {
            System.out.println("Sorry! the file can't be renamed");
        }
    }
}

