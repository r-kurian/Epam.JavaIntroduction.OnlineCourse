package Epam.Strings_and_basics_of_text_processing.Part3_3;

/*
Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор, позволяющий
последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег,
закрывающий тег, содержимое тега, тег без тела).
Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

Write an analyzer for xml document that allows sequentially return the contents
of the nodes of the xml document and its type  (opening tag, closing tag, tag content, tag without body).
Don't use ready-made XML parsers to solve this problem.

<notes>
    <note id = "1">
        <to>Peter</to>
        <from>Helen</from>
        <heading>Reminder</heading>
        <body>Call me tomorrow!</body>
    </note>
    <note id = "2">
        <to>John</to>
        <from>Mary</from>
        <heading>Important reminder!</heading>
        <body/>
    </note>
</notes>

*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3_3_Regex_Ex2 {

    private static final String XML_SPLIT_REGEX = "((?<open><[^/>]+?>)(?<body>.+?)(?<close></.+?>))|(?<openOnly><[^/>]+?>)|(?<closeOnly></.+?>)|(?<noBody><.+? />)|";

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("C:\\Users\\UserName\\Desktop\\xml.txt"));
        String myXMLString = sc.useDelimiter("\\A").next();
        sc.close();

        Pattern myPattern = Pattern.compile(XML_SPLIT_REGEX);
        Matcher findTag = myPattern.matcher(myXMLString);

        while (findTag.find()) {

            if (findTag.group("open") != null && findTag.group("close") != null) {
                System.out.println("Open tag: " + findTag.group("open") + "         Close tag: " + findTag.group("close") + "           Body tag: " + findTag.group("body"));

            } else if (findTag.group("close") == null && findTag.group("openOnly") != null) {
                System.out.println("Open tag: " + findTag.group("openOnly"));

            } else if (findTag.group("open") == null && findTag.group("closeOnly") != null) {
                System.out.println("Close tag: " + findTag.group("closeOnly"));

            } else if (findTag.group("noBody") != null) {
                System.out.println("Tag without body: " + findTag.group("noBody"));
            }
        }
    }
}
