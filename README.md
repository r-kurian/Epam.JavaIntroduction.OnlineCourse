# EPAM online course
## _Introduction to Java. General Programming_

## 1. Basics of software code development

[Linear programs](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basics_of_software_code_development/Part1_1): 1 — 6

[Branching](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basics_of_software_code_development/Part1_2): 1 — 5

[Loops](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basics_of_software_code_development/Part1_3): 1 — 8

## 2. Algorithmization 

[One-dimensional arrays](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Algorithmization/Part2_1): 1 — 10

[Arrays of arrays (matrix)](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Algorithmization/Part2_2): 1 — 16

[One-dimensional arrays. Sorts](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Algorithmization/Part2_3): 1 — 8

[Decomposition](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Algorithmization/Part2_4): 1 — 17

## 3. Strings and basics of text processing

[Working with a string as an array of characters](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Strings_and_basics_of_text_processing/Part3_1): 1 — 5

[Working with a string as an object of type String or StringBuilder](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Strings_and_basics_of_text_processing/Part3_2): 1 — 10

[Working with regular expressions (Pattern, Matcher)](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Strings_and_basics_of_text_processing/Part3_3): 1 — 2

## 4. Programming with classes 

[Classes and Object](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Programming_with_classes/Part4_1_Classes_And_Objects): 1 — 10

[Aggregation and Composition](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Programming_with_classes/Part4_2_Aggregation_And_Composition): 1 — 5

## 5. Basics of OOP

[Ex1](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basic_of_OOP/Part5_Ex1). Create an object of the Text File class using classes of File and Directory. Use the following methods: create, rename, display content to the console, add, delete.

[Ex2](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basic_of_OOP/Part5_Ex2).  Create a Payment class with an inner class that can be used to create a purchase of several products.

[Ex3](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basic_of_OOP/Part5_Ex3).  Create a Calendar class with an inner class that can be used to store information about weekends and holidays.

[Ex4](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basic_of_OOP/Part5_Ex4).  Create a console application "The Dragon's Treasure". A program allows processing information about 100 treasures in a dragons cave. Implement the function of treasure viewing, selection of the most expensive treasure and selection of treasures for a given amount.
The application should meet the following requirements:
> • The application must be object-oriented, not procedural-oriented.
> • Each class should have a meaningful name and informative composition.
> • Inheritance should only be used when it makes sense.
> • Java code convention must be used.
> • Classes should be correctly decomposed into packages.
> • The console menu should be minimalistic.
> • Files can be used to store data.

[Ex5](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Basic_of_OOP/Part5_Ex5a), variant A. Create an application that composes a flower bouquet (an object that represents a flower arrangement). Flowers and a package are the components of the bouquet.

 In your application you should meet the following requirements:
> • Correctly design and implement the problem domain.
> • Consider using generative design patterns to create objects from a class hierarchy.
> • Implement user input validation, but not client-side.
> • Regular expressions can be used to check the correctness of the transmitted data.
> • The menu for selecting an action by the user can be omitted, use a stub.
> • Special Condition: Overwrite the toString (), equals (), and hashCode () methods where necessary.

## 6. Tasks (Applications)

[Ex1](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Applications/Part6_Ex1_Library). Create a Console Application “Home Library”.

General requirements for the application:
> • The system takes into account ebooks and paper versions of books.
> • Existing roles: user, administrator.
> • The administrator can modify the book catalog.
> • The book catalog is stored in a text file.
> • User authentication data is stored in a text file. The password is not stored in cleartext.

Special conditions:
> • When a book description is added to the catalog, a notification about it is sent to all users by e-mail. 
> • While catalog browsing, it is desirable to implement page-by-page view. 
> • The user can suggest adding a book to the library by sending it to the administrator by e-mail.

[Ex2](https://github.com/r-kurian/Epam.JavaIntroduction.OnlineCourse/tree/master/src/Epam/Applications/Part6_Ex2_Notebook). Create a console application that works with Notes in Notebook. Each Note consists of a subject, a date, an e-mail address and a message body.

General explanations for the task:
> •  The data should be read from the file and saved to the file at the end of the work.
> •  The user should be able to find a note by any parameter or by a group of parameters (you can define a group of parameters yourself): * get the required note in a sorted form, * find the note, * the text field of which contains a specific word, *  and add a new note.

Special conditions:
> •  Search, compare and validate the input information using regular expressions. 
> •  Verification of the entered information for validity should be carried out by the code that directly adds the information.

Ex3. Create a client-server application "The Archive".

General requirements for the application:
> •  The archive contains Profiles (for example, Profiles of students). The archive is located on the server.
> •  The client, depending on the rights, can request the case to be reviewed, the changes to be made, or a new case to be created.

Other requirements:
> •  Use sockets to implement a network connection.
> • Format of data storage on the server - xml-files.

Ex4. Multithreading. "Sea Port" application. Ships enter the port to unload and load containers. The number of containers currently in the port and on the ship must be non-negative and in excess of the specified cargo capacity of the ship and the port capacity. There are several berths in the port. One ship can stay at one berth. The ship can be loaded at the berth or unloaded.
