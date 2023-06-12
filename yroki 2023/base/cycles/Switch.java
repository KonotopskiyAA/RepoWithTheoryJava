package base.cycles;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите свой возраст");
        String vozrast = vvod.nextLine();
        switch (vozrast){
            case "ноль" :
                System.out.println("Ты родился");
                break;

            case "семь" :
                System.out.println("Ты пошел в школу");
                break;
            default:
                System.out.println("Программа запуталась");
        }
    }
}
