package mnogopotochka;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KlassCountDownLatch {
    public static void main(String[] args) throws InterruptedException {//CountDownLatch - останавливает пришедшие потоки, пока внутренний счетчик не достигнет нуля.
        CountDownLatch countDownLatch = new CountDownLatch(3);//Где 3 - обратный отсчет, который нужно вызвать в методе countDown, чтобы await перестал ждать.

        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 3; i++) {
            executorService1.submit(new Processor(countDownLatch));
        }

        executorService1.shutdown();

        countDownLatch.await();
        System.out.println("Latch открыт, love Irisha");
    }
}

class Processor implements Runnable {
    private CountDownLatch countDownLatch;
    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();// countDownLatch - отсчитать назад
    }
}