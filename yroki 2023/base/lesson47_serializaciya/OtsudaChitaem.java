package base.lesson47_serializaciya;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OtsudaChitaem {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("family.bin"))){ //try with resources вместо:
           // FileInputStream fis = new FileInputStream("family.bin");//объект, читающий в байтах
          //  ObjectInputStream ois = new ObjectInputStream(fis);//чтение в виде объекта

            PersonSer3 person1 = (PersonSer3) ois.readObject();//чтение объекта и запись в объект Person
            PersonSer3 person2 = (PersonSer3) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
