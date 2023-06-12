package base.cycles;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner vvod= new Scanner(System.in);
        int znach;
        do {
            System.out.println("Введите 5");
            znach = vvod.nextInt();
        } while (znach!=5);

    }
}
