package pro_lyambdy2_v_metodah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson_2 {
    public static void main(String[] args) {//Можно передать лямбда-выражение в переменную.
        // Можно использовать в методах.
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

       /* for(int i = 0; i <10; i++){ // Стандартная реализация.
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);
        } */

        arr = Arrays.stream(arr).map(a -> a * 2).toArray(); // Функциональный метод
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }

    private static void fillArr(int[] arr) {
        for(int i = 0; i < 10; i++)
            arr[i] = i + 1;
    }

    private static void fillList(List<Integer> list) {
        for(int i = 0; i < 10; i++)
            list.add(i + 1);
    }


}

