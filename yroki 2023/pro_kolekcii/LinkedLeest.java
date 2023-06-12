package pro_kolekcii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLeest {//Связанный список - состоит из узлов (значение+ссылка на следующий узел). Head - начальное значение по умолчанию.
    // Односвязный список - связан с элементом справа. Двусвязный список - связан с элементами слева и справа.
    // Есть голова списка.
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        //linkedList.add(1);
        //linkedList.get(0);
        //linkedList.size();
        measureTime(linkedList);
        measureTime(arrayList);
    }
    private static void measureTime(List<Integer> list){
        //for (int i=0; i<100000;i++){
            //list.add(i);
        //}
        long start = System.currentTimeMillis();
        for (int i=0; i<100000;i++){
            list.add(0, i);

        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
