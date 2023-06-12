package lesson45_serializaciya;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OtsudaChitaem {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("family.bin");//объект, читающий в байтах
            ObjectInputStream ois = new ObjectInputStream(fis);//чтение в виде объекта

            PersonSer person1 = (PersonSer) ois.readObject();//чтение объекта и запись в объект Person
            PersonSer person2 = (PersonSer) ois.readObject();
            ois.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
