package base;

import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String stroka = vvod.nextLine();
        System.out.println("Вы ввели:" + " "+stroka);
    }
}
