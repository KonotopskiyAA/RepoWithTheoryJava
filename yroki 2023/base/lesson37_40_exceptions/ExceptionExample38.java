package base.lesson37_40_exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample38 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите цифру:");
        Scanner vvod = new Scanner(System.in);
        while (true){
           int x = Integer.parseInt(vvod.nextLine());
            if (x !=0) {
                throw new IOException("Пользователь ввел не ноль");
            }
        }
    }
}
