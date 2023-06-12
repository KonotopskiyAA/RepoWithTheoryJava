package base.lesson47_serializaciya;

import java.io.Serializable;

public class PersonSer3 implements Serializable {//сериализация -сохранение объектов во внешних файлах
    private int id;
    private String name;
    private transient String  abrakadabra; //transient - не сериализовывать
    //serialVersionUID - помечает состояние класса



    public PersonSer3(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.abrakadabra = abrakadabra;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return id + " : " + name + " " + abrakadabra;
    }

}
