package base;

public class Konstruktor {//Перегрузка методов - методы с одинаковым названием, но разными переменными, java определяет какой метод использовать с помощью переменной
    public static void main(String[] args) {

    }
}
class HumanKonstruktor{ //this - обращение к переменной класса, а не метода.
    String name;
    int age;

    public HumanKonstruktor(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo(){
        System.out.println(name+age);
    }
}