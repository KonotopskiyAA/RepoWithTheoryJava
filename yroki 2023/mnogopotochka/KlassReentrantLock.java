package mnogopotochka;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class KlassReentrantLock {// ReentrantLock - для синхронизации потоков. Дублирует synchronized.
    // Преимущество над synchronized - избегает вложенности synchronized.
    // unlock всегда используется в finally блоке(try, finally)

    public static void main(String[] args) throws InterruptedException {
        Zadacha zadacha = new Zadacha();
        Thread threadOdin = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        zadacha.firstThread();
                    }
                }
        );

        Thread threadDva = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        zadacha.secondThread();
                    }
                }
        );

        threadOdin.start();
        threadDva.start();

        threadOdin.join();
        threadDva.join();

        zadacha.pokazatOtschet();
    }
}

class Zadacha {
    private int otschet;
    private Lock lock = new ReentrantLock();
    private void increment(){
        for(int i = 0; i < 1000; i++){
            otschet++;
        }
    }

    public void firstThread(){
        lock.lock();//Блокировка
        increment();
        lock.unlock();//Разблокировка
    }
    public void secondThread(){
        lock.lock();
        increment();
        lock.unlock();
    }

    public void pokazatOtschet(){
        System.out.println(otschet);
    }
}