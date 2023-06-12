package lesson46_serializaciya_masiv;

import base.lesson46_serializaciya_masiv.PersonSer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class OtsudaChitaemMassive {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("family2.bin");//объект, читающий в байтах
            ObjectInputStream ois = new ObjectInputStream(fis);//чтение в виде объекта

            int familyCount = ois.readInt();
            PersonSer2[] family = new PersonSer2[familyCount];

            for (int i =0; i < familyCount; i++){
                family[i] = (PersonSer2) ois.readObject();
            }

            System.out.println(Arrays.toString(family));
            ois.close();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
