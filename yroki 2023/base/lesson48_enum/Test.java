package base.lesson48_enum;

import static base.lesson48_enum.Animal.Cat;

public class Test {//enum - тип данных - перечисления представляют набор логически связанных констант.

    public static void main(String[] args) {
        Animal animal = Cat;
        System.out.println(Cat.getNameOnRussian());
        switch (animal){
            case Cat:
                System.out.println("Это котик");
                break;
            case Dog:
                System.out.println("Это песик");
                break;
            case Frog:
                System.out.println("Это лягушка");
                break;
        }


    }
}
