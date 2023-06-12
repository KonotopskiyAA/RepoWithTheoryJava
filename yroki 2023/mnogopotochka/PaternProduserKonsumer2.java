package mnogopotochka;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PaternProduserKonsumer2 {// Через обычную очередь, не потокобезопасна.



    public static void main(String[] args) throws InterruptedException {//Методы wait и notify определены у любого объекта в java, т.к. определены у object.
        // intrinsic lock - монитор.
        // wait
        // notify
        ProduserKonsumer pk = new ProduserKonsumer();


        Thread threadProduce = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pk.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread threadConsume = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pk.consumer();
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

class ProduserKonsumer {
    private Queue<Integer> queuePK = new LinkedList<>();
    private final int LIMIT = 10;// Количество элементов в очереди.
    private final Object lock =  new Object();// Синхронизируемся на lock.
    public void producer() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queuePK.size() == LIMIT){
                    lock.wait();
                }

                queuePK.offer(value++);
                lock.notify();
            }
        }
    }
    public void consumer() throws InterruptedException {
       while (true) {
           synchronized (lock) {//
               while (queuePK.size() == 0){
                   lock.wait();
               }

               int value = queuePK.poll();
               System.out.println(value);
               System.out.println("Размер очереди " + queuePK.size());
               lock.notify();
           }

           Thread.sleep(1000);
       }
    }
}
