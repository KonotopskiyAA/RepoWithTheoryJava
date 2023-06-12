package pro_kolekcii;

import java.util.*;

public class InterfaycComparator {
    public static void main(String[] args) {// Сортировка объектов в коллекциях:
        // По умолчанию. Или переопределить метод Comparator. Сравниватель кастомный.
        List<String> animals = new ArrayList<>();

        animals.add("Frog");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Bu");
        animals.add("Ellefant");

        Collections.sort(animals, new StringLengthComparator());//по умолчанию.
        System.out.println(animals);
        System.out.println("");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(100);
        numbers.add(500);

        Collections.sort(numbers, new PoUbyvaniu());//по умолчанию.
        System.out.println(numbers);
        System.out.println("");

        List<Person3> people = new ArrayList<>();
        people.add(new Person3(1, "Ириша"));
        people.add(new Person3(2, "Арсюша"));
        people.add(new Person3(3, "НеПридумал"));

        Collections.sort(people, new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                return 0;
            }
        });

        System.out.println(people);

    }

}

class StringLengthComparator implements Comparator<String>{//Или в анонимный класс.
    @Override
    public int compare(String o1, String o2) {//Если первый объект больше второго - (1),
        // Если первый объект меньше второго - (-1), Если объекты равны - (0).
        if(o1.length() > o2.length()) {
            return 1;
        }else if (o1.length() < o2.length()) {
                return -1;
            } else  {
                return 0;
            }
        }

    }
class PoUbyvaniu implements Comparator<Integer>{//Или в анонимный класс.
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2){
            return -1;
        } else if (o1 <o2) {
            return 1;
        } else{
                return 0;
            }

        }
    }

class Person3 {
    private int id;
    private String name;

    public Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
