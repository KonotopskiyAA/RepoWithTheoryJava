package mnogopotochka;

import java.util.concurrent.Semaphore;

public class KlassSemaphore {
    public static void main(String[] args) {// Ограничение доступа к ресурсу.
        Semaphore semaphore = new Semaphore(3);// Где 3 - количество потоков, одновременно использующих ресурс.


        try {
            semaphore.acquire(); // Когда в потоке начинаем взаимодействие с ресурсом.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release(); // В потоке заканчиваем использовать ресурс.

        semaphore.availablePermits();// Количество свободных разрешений.

        System.out.println(semaphore.availablePermits());
    }
}
