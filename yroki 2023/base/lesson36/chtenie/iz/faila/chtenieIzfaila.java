package base.lesson36.chtenie.iz.faila;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class chtenieIzfaila {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToFile = "C:\\Users\\Arseniy Kntpsk\\Desktop\\TestData\\FileForReading.txt";
        File file = new File(pathToFile);
        Scanner vvod = new Scanner(file);
        while (vvod.hasNextLine()) {
            System.out.println(vvod.nextLine());
        }
        vvod.close();

    }
}
