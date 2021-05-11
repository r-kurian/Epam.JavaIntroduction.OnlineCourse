package Epam.Applications.Part6_Ex2_Notebook.utils;

public class Note {

    private String subject;
    private String date;
    private String email;
    private String text;

    public Note(String subject, String date, String email, String text) {
        this.subject = subject;
        this.date = date;
        this.email = email;
        this.text = text;
    }

    public Note() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return
                "\nSubject: " + subject +
                "\nDate: " + date +
                "\nEmail: " + email +
                "\nMessage: " + text;
    }
}
