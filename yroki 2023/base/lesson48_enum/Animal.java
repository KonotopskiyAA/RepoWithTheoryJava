package base.lesson48_enum;

public enum Animal {
    Dog("Собачка"), Cat("Кошка"), Frog("Лягушка"); // - объекты класса Animal - используются большие буквы, как константа
    private String nameOnRussian;

    // Object -> Enum -> Конкретный объект класса Enum (Dog, Cat, Frog)
    private Animal(String nameOnRussian){
        this.nameOnRussian = nameOnRussian;

    }

    public String getNameOnRussian() {
        return nameOnRussian;
    }
}
