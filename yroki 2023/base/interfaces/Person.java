package base.interfaces;

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void SayHello(){
        System.out.println("Приветик");
    }

    @Override
    public void showInfo() {
        System.out.println("мое имя"+this.name);
    }
}
