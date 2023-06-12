package pro_kolekcii;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {//Collection -> Set -> Sorted Set -> Navigable Set -> Tree Set.
    // Set - множество - это коллекция ТОЛЬКО с уникальными элементами.
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); //обычные объекты. Не сохраняет порядка. Основан на HashMap.
        // Ключи HashMap становятся значениями HashSet.
        Set<String> linkedHashSet = new LinkedHashSet<>(); //обычные объекты. Сохраняет порядок ввода.
        Set<String> treeSet = new TreeSet<>();//объекты сортируются по возрастанию.

        System.out.println("Заполнение Set'ов:");

        hashSet.add("Ириша");
        hashSet.add("Арсюша");
        hashSet.add("Владик");
        hashSet.add("Владик");//проигнорированы
        hashSet.add("Владик");//проигнорированы

        System.out.println(hashSet.contains("Ириша"));//Contains - значение внутри Set - true/false.
        // isEmpty - проверка на пустоту - true/false.


        hashSet.add("Ириша");
        hashSet.add("Арсюша");
        hashSet.add("Владик");
        hashSet.add("Владик");
        hashSet.add("Владик");

        for (String name: hashSet){
            System.out.println(name);
        }
        System.out.println("");
        linkedHashSet.add("ИришаLHS");
        linkedHashSet.add("АрсюшаLHS");
        linkedHashSet.add("ВладикLHS");

        for (String namelHS: linkedHashSet){
            System.out.println(namelHS);
        }
        System.out.println("");
        treeSet.add("Ириша1");
        treeSet.add("Арсюша2");
        treeSet.add("Владик3");

        for (String name: treeSet){
            System.out.println(name);
        }

        System.out.println("Множества:");//пересечение(inner join), объединение(full join), разность(left join без пересечения).
        //union - объединение
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(3);
        integerSet1.add(4);
        integerSet1.add(5);

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(3);
        integerSet2.add(4);
        integerSet2.add(5);
        integerSet2.add(6);
        integerSet2.add(7);

        Set<Integer> integerSetUnion = new HashSet<>(integerSet1);
        integerSetUnion.addAll(integerSet2);
        System.out.println("union - объединение: " + integerSetUnion);

        // intersection - пересечение
        Set<Integer> integerSetInter = new HashSet<>(integerSet1);
        integerSetInter.retainAll(integerSet2);
        System.out.println("intersection - пересечение: " + integerSetInter);

        // difference - разность
        Set<Integer> integerSetDif = new HashSet<>(integerSet1);
        integerSetDif.removeAll(integerSet2);
        System.out.println("difference - разность: " + integerSetDif);


    }
}
