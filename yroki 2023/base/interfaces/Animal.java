package base.interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("Я сплю, не будите меня");
    }

    @Override
    public void showInfo() {
        System.out.println("мой id "+this.id);
    }
}
