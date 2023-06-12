package Pro_Regulyarnie;

import java.util.Arrays;

public class Spleet {
    public static void main(String[] args) {//Сплит - принимает на вход регулярные выражение и разбивает строку по регулярному выражению
        String a = "Hello world is the best programm and i love Irisha";
        String[] words =a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "I love Irisha";
        String replaceString = b.replace(" ", "."); // Заменить.
        // replaceAll - принимает на вход регулярные выражения.
        // replaceFirst - принимает на вход регулярные выражения. Заменяет первое.
        System.out.println(replaceString);

    }
}
