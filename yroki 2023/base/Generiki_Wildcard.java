package base;

import java.util.ArrayList;
import java.util.List;

public class Generiki_Wildcard {
    public static void main(String[] args) {
        List<String> animals2 = new ArrayList<>();
        animals2.add("кошка");
        animals2.add("собака");
        animals2.add("птичка");
        String animals3 = animals2.get(1);
        System.out.println(animals3);
    }

}
