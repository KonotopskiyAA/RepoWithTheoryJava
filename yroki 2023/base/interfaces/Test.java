package base.interfaces;

public class Test {//Класс может наследовать любое количество интерфейсов и только один класс
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Ириша");
        animal1.sleep();
        person1.SayHello();
        animal1.showInfo();
        person1.showInfo();
    }
}
