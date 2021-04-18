package Epam.Basic_of_OOP.Part5_Ex1;


import org.jetbrains.annotations.NotNull;

import java.io.File;

public class Directory extends File {

    public Directory(@NotNull String pathname) {
        super(pathname);
    }

    public static void createFolder(File directory) {
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Folder has been created successfully");
            } else {
                System.out.println("Folder failed to be created");
            }
        } else {
            System.out.println("Folder already exist");
        }
    }

    public static void getAllFoldersInDirectory(File directory) {
        if (directory.isDirectory()) {

            for (File item : directory.listFiles()) {
                System.out.println("Here is a list of a folders and files:");
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " \t folder");
                } else {
                    System.out.println(item.getName() + " \t file");
                }
            }
        }
    }

    public static void renameDirectory(File directory) {
        if (directory.renameTo(new File("C:\\Users\\Roman\\Desktop\\myNEW!Folder"))) {
            System.out.println("Folder renamed successfully");
        } else {
            System.out.println("Failed to rename the folder");
        }
    }

    //Java isn't able to delete folders with data in it. You have to delete all files before deleting the folder.
    static void deleteDirectory(File directory) {
        File[] allContents = directory.listFiles();
        if (allContents != null) {
            System.out.println("...All files were deleted");
            System.out.println("...The folder was deleted");
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        directory.delete();
    }
}