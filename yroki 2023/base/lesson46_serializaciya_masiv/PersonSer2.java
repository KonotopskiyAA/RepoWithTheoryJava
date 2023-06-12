package base.lesson46_serializaciya_masiv;

import java.io.Serializable;

public class PersonSer2 implements Serializable {//сериализация -сохранение объектов во внешних файлах
    private int id;
    private String name;


    public PersonSer2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return id + " : " + name;
    }
}

