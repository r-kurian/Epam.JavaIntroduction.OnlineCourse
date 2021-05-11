package Epam.Applications.Part6_Ex2_Notebook;
/*

Create a console application that works with Notes in Notebook.
Each Note consists of a subject,  a date, an e-mail address and a  message body.

General explanations for the task.
• The data should be read from the file and saved to the file at the end of the work.

• The user should be able to find a note by any parameter or by a group of parameters
(you can define a group of parameters yourself), get the required note in a sorted form, find the note, the text field of which contains a specific word, and add a new note.

Special conditions:
* search, compare and validate the input information using regular expressions.
** verification of the entered information for validity should be carried out by the code that directly adds the information.

*/

/*
Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте.
Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).

Общие пояснения к практическому заданию.
• В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.

• У пользователя должна быть возможность найти запись по любому параметру или по группе параметров
(группу параметров можно определить самостоятельно), получить требуемые записи в отсортированном виде,
найти записи, текстовое поле которой содержит определенное слово, а также добавить новую запись.

• Особые условия:
* поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
** проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий информацию.
*/


import Epam.Applications.Part6_Ex2_Notebook.utils.MenuUtil;

public class Main {

    public static void main(String[] args) {
        MenuUtil.startMainMenu();
    }
}
