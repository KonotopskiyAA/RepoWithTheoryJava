package mnogopotochka;

import java.util.Random;
import java.util.concurrent.*;

public class KlassCallableAndFuture {// С помощью Callable и Future можно получать значения из потоков.
    // Методы позволяют выбрасывать исключения внутри потоков.
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {// Для возврата значения
            @Override
            public Integer call() throws Exception {
                System.out.println("Ириша супербулочка - поток начали");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Ириша пирожочек - поток остановили");
                Random random = new Random();
                int randomValue = random.nextInt();

                if(randomValue < 5)
                    throw new Exception("Число маленькое");
                return random.nextInt(10);
            }
        });
        executorService.shutdown();

        try {
            int resultat = future.get(); // Метод get дожидается окончания выполнения потока
            System.out.println(resultat);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
