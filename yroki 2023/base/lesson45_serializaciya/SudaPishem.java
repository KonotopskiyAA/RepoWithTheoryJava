package lesson45_serializaciya;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SudaPishem {
    public static void main(String[] args) {
        PersonSer person1 = new PersonSer(1, "Ириша");
        PersonSer person2 = new PersonSer(2, "Арсюша");

        try {
            FileOutputStream fos = new FileOutputStream("family.bin");//для записи последовательности байтов в файл
            ObjectOutputStream ops = new ObjectOutputStream(fos);//для записи объектов

            ops.writeObject(person1);//запись конкретных объектов
            ops.writeObject(person2);
            ops.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
