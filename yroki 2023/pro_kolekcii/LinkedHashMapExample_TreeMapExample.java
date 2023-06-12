package pro_kolekcii;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapExample_TreeMapExample {// Сохраняет порядок добавление новых пар ключ-значение в map.

    public static void main(String[] args) {
        Map <Integer, String> hashMap = new HashMap<>();// внутри не гарантируется порядка.
        Map <Integer, String> linkedHashMap = new LinkedHashMap<>(); // гарантируется порядок добавление пар ключ-значение. По добавлению.
        Map <Integer, String> treeMap = new TreeMap<>();// гарантирует сортировку пар ключ-значение по ключу. Для ключа должен быть задан критерий сортировки.
        testMap(hashMap);
        System.out.println("");
        testMap(linkedHashMap);
        System.out.println("");
        testMap(treeMap);
        System.out.println("");
    }
    public static void testMap(Map<Integer, String> map){
        map.put(21, "Ириша");
        map.put(28, "Арсюша");
        map.put(0, "Владик");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
