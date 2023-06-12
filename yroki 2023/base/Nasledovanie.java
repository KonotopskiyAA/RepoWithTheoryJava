package base;

public class Nasledovanie {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.breathe();
    animal.sleep();
        Cat barsik = new Cat();
        barsik.breathe();
        barsik.sleep();
        barsik.meow();
    }
}
