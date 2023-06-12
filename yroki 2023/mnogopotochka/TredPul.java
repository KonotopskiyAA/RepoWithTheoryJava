package mnogopotochka;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TredPul {// Тредпул - множество потоков

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);// В классе ExecutorService есть статический метод newFixedThreadPool.
        // ExecutorService - пул потоков - сервис по выполнению.
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));// Подставляем объект класса, реализующего интерфейс Runnable.
        }
        executorService.shutdown();// Метод shutdown - прекратить передачу заданий - как метод start.
        System.out.println("Все задачи запущены.");

        executorService.awaitTermination(1, TimeUnit.DAYS);// Метод ожидания выполнения задач в потоке.
    }
}

class Work implements Runnable{
    private int id;

    public Work(int id){
        this.id = id;

    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Работа " + id+ " выполнена - Irisha super peps");
    }
}