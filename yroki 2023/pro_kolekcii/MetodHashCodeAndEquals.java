package pro_kolekcii;

import java.util.*;

public class MetodHashCodeAndEquals {
    public static void main(String[] args) {//Необходимо переопределение HashCode и Equals для правильного сравнения объектов.
        //Контракт HashCode и Equals - для ускорения проверки на равенство используют HashCode и Equals. Сначала HashCode, затем Equals.
        // Hash'и разные - объекты разные. Если Hash'и одинаковые - дергаем Equals.

        Map<Person, String> hashMap = new HashMap<>();
        Set<Person> hashSet = new HashSet<>();


        Person person1 = new Person(1, "Объект Персон1");
        Person person2 = new Person(1, "Объект Персон1");

        hashMap.put(person1, "123");//
        hashMap.put(person2, "123");//

        hashSet.add(person1);
        hashSet.add(person2);

        System.out.println(hashMap);
        System.out.println(hashSet);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
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

    @Override
    public boolean equals(Object o) {//Сравнение
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {//Преобразование объекта произвольный длины в число фиксированной длины.
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;//Конвертация в целое число - представление объекта.
    }
}
