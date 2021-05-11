package Epam.Applications.Part6_Ex2_Notebook.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {

    protected static final String DELIMITER = "----------";
    private File file;
    private List<Note> noteList;

    public Notebook() {
        readFile();
    }

    private void readFile() {
        noteList = new ArrayList<>();

        file = new File("src/Epam/Applications/Part6_Ex2_Notebook/files/myNotes");

        if (file.exists() && file.canRead()) {
            try (Scanner scanner = new Scanner(new FileReader(file))) {
                while (scanner.hasNextLine()) {
                    String subject = scanner.nextLine();
                    String date = scanner.nextLine();
                    String email = scanner.nextLine();
                    StringBuilder text = new StringBuilder("");
                    String nextLine;
                    while (scanner.hasNextLine() && !(nextLine = scanner.nextLine()).equals(DELIMITER)) {
                        text.append(nextLine);
                        text.append("\n");
                    }
                    String textStr = text.toString();
                    while (textStr.endsWith("\n")) {
                        textStr = textStr.substring(0, textStr.length() - 1);
                    }

                    noteList.add(new Note(subject, date, email, textStr));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void saveToFile() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (file.setWritable(true)) {
            try (PrintWriter out = new PrintWriter(file)) {
                for (Note note : noteList) {
                    out.println(note.getSubject());
                    out.println(note.getDate());
                    out.println(note.getEmail());
                    out.println(note.getText());
                    out.println(DELIMITER);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Error. Try to save the file again");
        }
    }

    public int numOfNotes() {
        return noteList.size();
    }

    public void addNote(Note note) {
        noteList.add(note);
    }

    public void printAll() {
        for (Note note : noteList) {
            System.out.println(note);
            System.out.println(DELIMITER);
        }
    }

    public void sortByDateThenByEmail() {
        Comparator<Note> comparator = Comparator.comparing(Note::getDate);
        comparator.thenComparing(Note::getEmail);
        noteList.sort(comparator);
        for (Note note : noteList) {
            System.out.println(note);
            System.out.println(DELIMITER);
        }
    }

    public void findBySubject() {
        String mySubject = InputUtil.readInput();

        List<Note> notesBySubject = new ArrayList<>();

        Pattern pattern = Pattern.compile(mySubject);
        Matcher matcher;
        for (Note note : noteList) {
            matcher = pattern.matcher(note.getSubject());
            if (matcher.find()) {
                notesBySubject.add(note);
            }
        }

        for (Note noteWithMySubject : notesBySubject) {
            System.out.println(noteWithMySubject);
            System.out.println(DELIMITER);
        }
    }

    public void findByEmail() {
        System.out.println("Enter the email that should to be found:");
        String myEmail = InputUtil.checkInputEmail();

        List<Note> notesByEmail = new ArrayList<>();

        Pattern pattern = Pattern.compile(myEmail);
        Matcher matcher;
        for (Note note : noteList) {
            matcher = pattern.matcher(note.getEmail());
            if (matcher.find()) {
                notesByEmail.add(note);
            }
        }

        for (Note noteWithMyEmail : notesByEmail) {
            System.out.println(noteWithMyEmail);
            System.out.println(DELIMITER);
        }
    }

    public void findByWordInMessage() {
        System.out.println("Enter the word that should to be found in the notes:");
        String myWord = InputUtil.checkInputSubject();

        List<Note> notesByWord = new ArrayList<>();

        Pattern pattern = Pattern.compile(myWord);
        Matcher matcher;
        for (Note note : noteList) {
            matcher = pattern.matcher(note.getText());
            if (matcher.find()) {
                notesByWord.add(note);
            }
        }

        for (Note noteWithMySubject : notesByWord) {
            System.out.println(noteWithMySubject);
            System.out.println(DELIMITER);
        }
    }


    public void removeNote() {
        System.out.println("Write the subject of the message that should be removed from the notebook");
        String subjectToRemove = InputUtil.checkInputSubject();

        for (int i = 0; i < noteList.size(); i++) {
            if (noteList.get(i).getSubject().equals(subjectToRemove)) {
                noteList.remove(noteList.get(i));
            }
        }
        writeToFile();
    }

    private void writeToFile() {
        if (noteList.size() > 0) {
            try {
                FileWriter writer = new FileWriter(file);
                for (Note note : noteList) {
                    writer.write(note.toString() + "\n");
                }
                writer.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
