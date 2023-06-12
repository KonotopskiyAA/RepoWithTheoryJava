package pro_kolekcii;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {//interface Map(Ключ-значение) -> HashMap.
        // HashMap - внутри массив связанных списков(hash_key_value) на n элементов.
        // Остаток побитового умножения (hash &(умножается) на (n-1)), где n длина массива - расположение внутри массива.
        // HashMap - не может быть дубликатов ключей.
        // Пары ключ-значение в HashMap не гарантируют порядка из-за хеширования.
        Map<Integer, String> mapExample = new HashMap<>();//<> - тип ключа/значения
        mapExample.put(1,"Один");
        mapExample.put(2,"Два");
        mapExample.put(3,"Три");

        System.out.println(mapExample);

        mapExample.put(3, "Three");
        System.out.println("Новое значение"+mapExample);

        System.out.println(mapExample.get(2));

        for(Map.Entry<Integer, String> entry : mapExample.entrySet()){//Каждая пара ключ-значение в java - entry.
            // entrySet - метод возвращает набор всех пар ключ-значений в map.
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

    }

}
