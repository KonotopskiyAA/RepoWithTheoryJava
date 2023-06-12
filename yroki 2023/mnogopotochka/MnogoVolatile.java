package mnogopotochka;

import java.util.Scanner;

public class MnogoVolatile {//Синхронизация потоков.
    // Проблема когерентности кэшей - одно из ядер имеет собственный кэш, кэши не совпадают.
    // Volatile - переменная может быть изменена, не нужно кэшировать. Находится в главной памяти.
    // Synchronized -
    public static void main(String[] args) {
        MyThreadVolatile myThreadV = new MyThreadVolatile();
        myThreadV.start();

        Scanner scanner = new Scanner(System.in);
        scanner.hasNextLine();

        myThreadV.shutDown();
    }
}

class MyThreadVolatile extends Thread {
    private volatile boolean runnning = true;

    @Override
    public void run() {
        while (runnning) {
            System.out.println("Hello, from first thread, Irisha");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutDown() {
        this.runnning = false;
    }
}
