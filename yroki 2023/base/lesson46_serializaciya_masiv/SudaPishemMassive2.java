package base.lesson46_serializaciya_masiv;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SudaPishemMassive2 {//здесь пишем массив как объект
    public static void main(String[] args) {
        PersonSer2[] family = {new PersonSer2(1, "Ириша"),
                new PersonSer2(2, "Арсюша"), new PersonSer2(3, "Пепс"), new PersonSer2(4, "Жепс")};

        try {
            FileOutputStream fos = new FileOutputStream("family3.bin");//для записи последовательности байтов в файл
            ObjectOutputStream ops = new ObjectOutputStream(fos);//для записи объектов

            ops.writeObject(family);

            ops.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}