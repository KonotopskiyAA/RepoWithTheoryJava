package base;

public class This {
    public static void main(String[] args) {
    Human humanOne = new Human();
    humanOne.setAge(21);
    humanOne.setName("Ириша");
    humanOne.getInfo();
    }
}

class Human{ //this - обращение к переменной класса, а не метода.
    String name;
    int age;

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