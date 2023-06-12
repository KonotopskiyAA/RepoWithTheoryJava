package mnogopotochka;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLok{// Deadlock - это ситуация в многозадачной среде или СУБД, при которой несколько процессов
    // находятся в состоянии бесконечного ожидания ресурсов, захваченных самими этими процессами.
    // Избежать Deadlock - забирать локи в разных потоках в одном порядке.
    // ИЛИ метод reentrantLock. tryLock - забирает лок и возращает true.
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread potok1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.perviyPotok();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread potok2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.vtoroiPotok();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        potok1.start();
        potok2.start();

        potok1.join();
        potok2.join();

        runner.konec();
    }
}

class Runner {

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private void takeLocks(Lock lock1, Lock lock2) throws InterruptedException {
        boolean perviyLockZanyat = false;
        boolean vtoroiLockZanyat = false;

        while (true) {
            try {
                perviyLockZanyat = lock1.tryLock();
                vtoroiLockZanyat = lock2.tryLock();
            } finally {
                if (perviyLockZanyat && vtoroiLockZanyat) {
                    return;// Если забрали оба лока - выходим из цикла.
                }
                if (perviyLockZanyat) {
                    lock1.unlock();
                }
                if (vtoroiLockZanyat) {
                    lock2.unlock();
                }
            }
            Thread.sleep(1);
        }
    }
    private Schet schetOne = new Schet();
    private Schet schetTwo = new Schet();
    public void perviyPotok() throws InterruptedException {
        Random random = new Random();

        for(int i = 0; i < 1000; i++){
            takeLocks(lock1, lock2);
            try {
                Schet.perevod(schetOne, schetTwo, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void vtoroiPotok() throws InterruptedException {
        Random random = new Random();
        for(int i = 0; i < 1000; i++) {
            takeLocks(lock1, lock2);
            try {
                Schet.perevod(schetTwo, schetOne, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void konec() {
        System.out.println(schetOne.getBalance());
        System.out.println(schetTwo.getBalance());
        System.out.println("Общий баланс: " + (schetOne.getBalance() + schetTwo.getBalance()));
    }
}

class Schet {
    private int balance = 10000;

    public void zachislenie(int summa){
        balance = balance + summa;
    }

    public void spisanie(int summa){
        balance = balance - summa;
    }
    public int getBalance(){
        return balance;
    }
    public static void perevod(Schet schet1, Schet schet2, int summa) {
        schet1.spisanie(summa);
        schet2.zachislenie(summa);
    }
}