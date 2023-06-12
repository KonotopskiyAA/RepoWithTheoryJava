package mnogopotochka;

import java.util.Scanner;

public class MetodyWaitNotify {
    public static void main(String[] args) throws InterruptedException {//Методы wait и notify определены у любого объекта в java, т.к. определены у object.
        // intrinsic lock - монитор.
        // wait
        // notify
        WaitAndNotify wn = new WaitAndNotify();


        Thread threadProduce = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread threadConsume = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadProduce.start();
        threadConsume.start();

        threadProduce.join();// Ждем окончания исполнения.
        threadConsume.join();

    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Поток продюсера запущен");
            wait();// Может вызываться только в пределах синхронизованного блока.
            // wait/notify вызывается в контексте.
            // 1 -> Отдаем intrinsic lock. 2 -> Ждем вызова notify, именно на этом объекте.
            // wait без аргументов - ждем сколько угодно.
            // wait  с аргументами - ждем сколько указано в параметре.
            System.out.println("Поток продюсера продолжил работу");
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scannerchik = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Ожидаем нажатия Enter");
            scannerchik.nextLine();
            notify();// Пробуждает один поток
            // notifyAll - пробуждает все потоки.

        }
    }
}