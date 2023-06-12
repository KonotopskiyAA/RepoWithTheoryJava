package base.lesson43.vlozhennie.klasy;

public class Electrocar { //Класс называется вложенным (nested), если он определен внутри другого класса
    private int id;

    private  class Motor{
        public void startMotor() {
            System.out.println("Мотор запущен");
        }
    }
    public static class Battery {
        public void charge(){
            System.out.println("Батарея заряжается");
        }
    }
    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        System.out.println(id);
        class SomeClass {
            public void someMethod(){

            }
        }
    }
}
//три типа вложенных классов:
//1 - нестатический класс - для разделения на подобъекты - Motor
//2 - статический вложенный класс - компоновка связанных классов, получает доступ к статическим полям и методам внешнего класса, в который вложен - Battery
//3 - локальный класс - класс внутри методов - SomeClass - доступ только к константам