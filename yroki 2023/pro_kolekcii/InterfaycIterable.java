package pro_kolekcii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaycIterable {//Iterable - Итерируемый.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);



        for (int x : list)
            System.out.println(x);// Под капотом работает так: Iterator<Integer> iterator = list.iterator()
        // - до Java 5 работало напрямую + while.

    }
}
