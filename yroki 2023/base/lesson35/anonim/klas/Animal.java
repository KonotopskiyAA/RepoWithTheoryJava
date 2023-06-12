package base.lesson35.anonim.klas;

class Animal {
    public void eat() {
        System.out.println("Зверь ест");
    }
}

interface AbleToEat {
    public void eat2();
}

class Animal2 implements AbleToEat {
    @Override
    public void eat2() {
        System.out.println("Зверь2 ест из интерфейса");
    }
}

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal(){//Объект наследник, с переопределенным методом eat, но его не видно
            @Override
            public void eat() {
                System.out.println("Зверь есть из анонимного класса");
            }
        };
        animal2.eat();//animal2 - объект - наследник класса animal

    }
}

class TestWithInterface {
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2();
        animal2.eat2();
    }
}