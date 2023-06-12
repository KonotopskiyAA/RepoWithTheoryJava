package base;

public class Static {// static - переменная класса, а не экземпляру
}
class HumanKonstruktorTwo{ //this - обращение к переменной класса, а не метода.
    String name;
    int age;
    public static String description;

    public HumanKonstruktorTwo(String name, int age) {
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