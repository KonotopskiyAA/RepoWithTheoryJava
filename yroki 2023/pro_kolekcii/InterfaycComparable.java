package pro_kolekcii;

import java.util.*;

public class InterfaycComparable {
    public static void main(String[] args) {
        List<PersonCom> peopleList = new ArrayList<>();
        Set<PersonCom> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }
    private static void addElements(Collection collection){
        collection.add(new PersonCom(1, "Irisha"));
        collection.add(new PersonCom(3, "Sber"));
        collection.add(new PersonCom(2, "Arsusha"));

    }
}

class PersonCom implements Comparable<PersonCom>{
    private int id;
    private String name;

    public PersonCom(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonCom person = (PersonCom) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(PersonCom o) {
        if(this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        }
        else {
            return 0;
    }
    }
}
