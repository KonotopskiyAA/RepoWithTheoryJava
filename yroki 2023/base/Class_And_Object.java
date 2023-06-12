package base;

public class Class_And_Object { // Публичный класс может быть только один в java файле
    public static void main(String[] args) {
        Person personFirst = new Person();
        personFirst.setName("Арсюша");
        personFirst.age = 27;
        personFirst.predstavitsya();
        personFirst.pensVozrast();

        Person personSecond = new Person();
        personSecond.name = "Ириша";
        personSecond.age = 21;
        personSecond.pensVozrast();
        personSecond.predstavitsya();

    }
}

class Person {
    String name;
    int age;

    void setName(String userName){
        name = userName;

    }

    void pensVozrast() {//В круглых скобках параметры.
        int years = 65 - age;
        System.out.println("Лет до пенсии "+years);
    }

    void predstavitsya(){ //тип возвращаемого значения. 1. void = пусто.
        for(int i =0; i<3; i++) {
            System.out.println("my name is " + name + " ,мне " + age + " лет");
        }

    }
    //У класса могут быть: 1. Данные(Поля), 2. Действия(Методы)
}