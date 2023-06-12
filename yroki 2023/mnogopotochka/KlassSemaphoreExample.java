package mnogopotochka;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class KlassSemaphoreExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorServiceSE = Executors.newFixedThreadPool(20);

        Connection connection = Connection.getConnection();
        for(int i = 0; i < 20; i++) {
            executorServiceSE.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.rabotai();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }

        executorServiceSE.shutdown();

        executorServiceSE.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphoreE = new Semaphore(10);
    private Connection () {// Запрещаем создавать объекты класса

    }
    public static Connection getConnection(){
        return connection;
    }
    public void rabotai() throws InterruptedException {
        semaphoreE.acquire();
        try {
            delaiRabotu();// Чтобы не возникло в методе delaiRabotu исполнение программы дойдет до semaphoreE.release()
        } finally {
            semaphoreE.release();
        }
    }
    private void delaiRabotu() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}
