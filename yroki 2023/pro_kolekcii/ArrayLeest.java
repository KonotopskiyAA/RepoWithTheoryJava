package pro_kolekcii;

import java.util.ArrayList;

public class ArrayLeest {//ArrayList - функционал динамического массива, который расширяется

    // при добавлении объектов
    //iterable -> его наследует Collection -> его наследует List, Queue и Set ->
    // List наследует ArrayList, LinkedList, Vector
    public static void main(String[] args) {
        ArrayList<Integer> arrayLeest = new ArrayList<>();
        for (int i = 0; i < 100; i++) {//пройтись по всем элементам - for, forEach
            arrayLeest.add(i);
        }
        System.out.println(arrayLeest);
        System.out.println(arrayLeest.get(35));
        System.out.println(arrayLeest.size());
        arrayLeest.remove(5);//удалить элемент из массива-неэффективно из центра, т.к. удаление
        //происходит со смещением
        //при использовании класса из java colletction - сослаться на уровень выше, т.е. List

    }
}
