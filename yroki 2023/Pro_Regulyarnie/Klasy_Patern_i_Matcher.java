package Pro_Regulyarnie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Klasy_Patern_i_Matcher {
    public static void main(String[] args) {//Pattern - регулярное выражение.
        // Matcher - использует паттерн для проведения операции над строкой.
        String text = "Тут некий огромный текст, ехохо. kntpskia@gmail.com";
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");//Создали объект, т.к. приватный конструктор, нельзя пользоваться напрямую через new.
        Matcher matcher = email.matcher(text);//Создали объект, т.к. приватный конструктор

        while(matcher.find()) {
            System.out.println(matcher.group(1));// Возвращает найденное методом find. Т.к. идет разделение на группы регулярных выражений.
            // Если в group передать id - группы, то будет выведена только группа. Нумерация id начинается с 1. Слева направо.
        }
    }
}
