package pro_lyambdy2_v_metodah;

import java.util.*;
import java.util.stream.Collectors;

public class Lesson_2_2 {
    public static void main(String[] args) {//Можно передать лямбда-выражение в переменную.
        // Можно использовать в методах.
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);


       /* for(int i = 0; i <10; i++){ // Стандартная реализация.
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);
        } */
        //map methods
        arr = Arrays.stream(arr).map(a -> a * 2).toArray(); // Функциональный метод. Итерируется по элементу и умножает.
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());


        arr = Arrays.stream(arr).map(a -> 3).toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        //filter method - фильтрует данные. boolean.
        int [] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        //forEach как метод
        Arrays.stream(arr2).forEach(a -> System.out.println(a));
        list2.stream().forEach(a -> System.out.println(a));

        //reduce - уменьшение, работает как цикл.
        int [] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum1 = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt(); // acc - сумма(равен первому элементу в массиве по умолчанию), b - текущее значение.
        int sum2 = list3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum1);
        System.out.println(sum2);

        int [] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();

        fillArr(arr4);
        fillList(list4);

        arr4 = Arrays.stream(arr4).filter(a -> a % 2 == 1).map(a-> a * 2).toArray();
        System.out.println(Arrays.toString(arr4));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(6);
        System.out.println(set);

        set = set.stream().map(a -> a * 2).collect(Collectors.toSet());
        System.out.println(set);
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

