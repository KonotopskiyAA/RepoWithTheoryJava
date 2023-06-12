package mnogopotochka;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PaternProduserKonsumer {// Паттерн - производитель/потребитель.
    // java util concurrent - пакет, все для многопоточки - все классы потоко - безопасны, т.е. синхронизованны.
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    public static void main(String[] args) throws InterruptedException {
        // BlockingQueue - интерфейс.
        // ArrayBlockingQueue - реализация интерфейса, через массив, потока безопасно, не больше 10 жлементов.
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
           Thread thread2 = new Thread(new Runnable() {
               @Override
               public void run() {
                   try {
                       consumer();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           });
           thread1.start();
           thread2.start();

           thread1.join();
           thread2.join();
    }
    private static void produce() throws InterruptedException {
        Random random = new Random();

        while (true){
            queue.put(random.nextInt(100));//Потокобезопасно.
        }
    }
    private static void consumer() throws InterruptedException {//Потокобезопасно.
        while (true){
            Thread.sleep(1000);
            System.out.println(queue.take());
            System.out.println("Размер очереди " + queue.size());
        }
    }
}

