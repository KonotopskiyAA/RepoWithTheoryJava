package base.lesson37_40_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExample37 {//исключение распространяется на один метод в текущем классе
    public static void main(String[] args) {
        File file = new File ("somePath");
        try {
            Scanner vvod = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Где файл, родной?)");
        }

    }
}
