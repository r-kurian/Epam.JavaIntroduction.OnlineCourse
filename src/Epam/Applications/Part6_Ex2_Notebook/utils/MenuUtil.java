package Epam.Applications.Part6_Ex2_Notebook.utils;

public class MenuUtil {

    static Notebook myNotebook = new Notebook();

    public static void startMainMenu() {

        System.out.println("Welcome to the Notebook.");

        while (true) {
            System.out.println(getMainMenuOptions());
            int option = InputUtil.checkOption();
            if (option != 0) {
                performMainMenuOperation(option);
            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    public static void startFilterSubMenu() {
        while (true) {
            System.out.println(getFilterSubMenuOptions());
            int selectionOfFilter = InputUtil.checkOption();
            if (selectionOfFilter != 0) {
                performFilterSubMenuOperation(selectionOfFilter);
            } else {
                break;
            }
        }
    }



    private static String getMainMenuOptions() {
        System.out.println("You have " + myNotebook.numOfNotes() + " notes.");
        return "\nAvailable menu-options:\n" +
                "1. Print all notes.\n" +
                "2. Add a new note.\n" +
                "3. Filter notes by Email, Subject or Message.\n" +
                "4. Sort notes by Date then by Email.\n" +
                "5. Delete some notes by Subject\n" +
                "0. Finish current session.\n";
    }

    private static String getFilterSubMenuOptions() {
        return "\nSelect the type of filter: \n" +
                "1. Filter by Email\n" +
                "2. Filter by Subject\n" +
                "3. Filter by Message\n" +
                "0. Back to the main Menu\n";
    }



    private static void performFilterSubMenuOperation(int selectionOfFilter) {
        switch (selectionOfFilter) {
            case 1:
                myNotebook.findByEmail();
                break;
            case 2:
                myNotebook.findBySubject();
                break;
            case 3:
                myNotebook.findByWordInMessage();
                break;
        }
    }


    private static void performMainMenuOperation(int option) {
        switch (option) {
            case 1:
                myNotebook.printAll();
                break;
            case 2:
                Note note = getNote();
                myNotebook.addNote(note);
                break;
            case 3:
                startFilterSubMenu();
            case 4:
                myNotebook.sortByDateThenByEmail();
                break;
            case 5:
                myNotebook.removeNote();
                break;
        }
        myNotebook.saveToFile();
    }

    private static Note getNote() {

        Note note = new Note();
        System.out.println("Enter the subject: ");
        String subject = InputUtil.checkInputSubject();
        note.setSubject(subject);

        System.out.println("Enter the date \"yyyy-mm-dd\": ");
        String date = InputUtil.checkInputYear();
        note.setDate(date);

        System.out.println("Enter the email address: ");
        String email = InputUtil.checkInputEmail();
        note.setEmail(email);

        System.out.println("Write the body of the note. To end and save your note write \"END\"");
        StringBuilder text = new StringBuilder("");
        String newLine = "";
        while (!(newLine = InputUtil.readInput()).equals("END")) {

            text.append(newLine);
            text.append("\n");
        }

        String textStr = text.toString();
        while (textStr.endsWith("\n")) {
            textStr = textStr.substring(0, textStr.length() - 1);
        }

        note.setText(textStr);

        return note;
    }
}
