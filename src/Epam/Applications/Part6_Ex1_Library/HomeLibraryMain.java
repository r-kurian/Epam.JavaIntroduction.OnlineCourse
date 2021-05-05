package Epam.Applications.Part6_Ex1_Library;

/*
Create a Console Application “Home Library”.

General requirements for the application:
• The system takes into account ebooks and paper versions of books.
• Existing roles: user, administrator.
• The user can view books in the book catalog, search for books in the catalog.
• The administrator can modify the book catalog.

* When a book description is added to the catalog, a notification about it is sent to all users by e-mail.
** by catalog browsing, it is desirable to implement page-by-page browsing.
*** The user can suggest adding a book to the library by sending it to the administrator by e-mail.

• The book catalog is stored in a text file.
• User authentication data is stored in a text file. The password is not stored in cleartext.
*/

/*
Создать консольное приложение “Учет книг в домашней библиотеке”.

Общие требования к заданию:
•  Система учитывает книги как в электронном, так и в бумажном варианте.
•  Существующие роли: пользователь, администратор.
•  Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.
•  Администратор может модифицировать каталог.

* При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям.
** При просмотре каталога желательно реализовать постраничный просмотр.
*** Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.

•  Каталог книг хранится в текстовом файле.
•  Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде.
 */


import Epam.Applications.Part6_Ex1_Library.utils.MenuUtil;

public class HomeLibraryMain {
    public static void main(String[] args) {
        MenuUtil.start();
    }

    // admin: login = login, pass = 1234
    // user: login = user, pass = 1234
}
