package base.lesson46_serializaciya_masiv;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class OtsudaChitaemMassive2 {//читаем массив как объект
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("family3.bin");//объект, читающий в байтах
            ObjectInputStream ois = new ObjectInputStream(fis);//чтение в виде объекта

            PersonSer2[] family = (PersonSer2[]) ois.readObject();

            System.out.println(Arrays.toString(family));
            ois.close();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
