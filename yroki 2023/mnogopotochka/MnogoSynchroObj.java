package mnogopotochka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MnogoSynchroObj {//Синхронизация на объекте.
    public static void main(String[] args) {

        new Worker().kakoiToMetod();
    }
}
class Worker {
    Random random = new Random();
    Object lock1 = new Object();// Объект для синхронизации
    Object lock2 = new Object();// Объект для синхронизации

        private List<Integer> list1 = new ArrayList<>();
        private List<Integer> list2 = new ArrayList<>();

        public void addToListOne() {
            synchronized (lock1) {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    list1.add(random.nextInt(10));
                }
            }
        }

        public void addToListTwo(){
            synchronized (lock2) {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    list2.add(random.nextInt(10));
                }
            }

        }

        public void work(){
            addToListOne();
            addToListTwo();
        }

        public void kakoiToMetod(){
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

            try {
                thread1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            long after = System.currentTimeMillis();
        System.out.println("На исполнение программы понадобилось: "+ (after - before) +" ms.");

            System.out.println("Размер список 1:" + list1.size());
            System.out.println("Размер список 2:" + list2.size());
    }
}