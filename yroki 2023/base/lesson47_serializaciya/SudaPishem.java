package base.lesson47_serializaciya;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SudaPishem {
    public static void main(String[] args) {
        PersonSer3 person1 = new PersonSer3(1, "Ириша", "time");
        PersonSer3 person2 = new PersonSer3(2, "Арсюша", "time");

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
