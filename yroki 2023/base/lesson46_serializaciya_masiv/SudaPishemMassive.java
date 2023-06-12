package lesson46_serializaciya_masiv;

import base.lesson46_serializaciya_masiv.PersonSer2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SudaPishemMassive {
    public static void main(String[] args) {
        PersonSer2[] family = {new PersonSer2(1, "Ириша"),
                new PersonSer2(2, "Арсюша"), new PersonSer2(3, "Пепс"), new PersonSer2(4, "Жепс")};

        try {
            FileOutputStream fos = new FileOutputStream("family2.bin");//для записи последовательности байтов в файл
            ObjectOutputStream ops = new ObjectOutputStream(fos);//для записи объектов

            ops.writeInt(family.length);
            for (PersonSer2 y : family) {
                ops.writeObject(y);
            }

            ops.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}