package base.lesson42_equals;

public class Test {//equals для сравнения структур, а не ссылок

            public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1.equals(animal2));
    }
}

class Animal {
    private int id;
    public Animal(int id) {
        this.id = id;
    }
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }

}