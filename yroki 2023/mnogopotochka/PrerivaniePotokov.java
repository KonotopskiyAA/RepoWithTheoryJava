package mnogopotochka;

import java.util.Random;

public class PrerivaniePotokov {// Прерывание потоков -

    public static void main(String[] args) throws InterruptedException { //InterruptedException - исключение, когда выплняемый поток прерывается.
        Thread nekiyPotok = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for(int i = 0; i < 1_000_000_000; i++) {
                    if(Thread.currentThread().isInterrupted()){//isInterrupted - true, если поток прерван
                        System.out.println("Поток был прерван, а Ириша сладкий пирожочек");
                        break;
                    }

                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Запустили поток");

        nekiyPotok.start();

        Thread.sleep(1000);
        nekiyPotok.interrupt();// Не останавливает поток, но даем сообщение потоку, что хотим его остановить.

        nekiyPotok.join();

        System.out.println("Поток остановился, ведь Ириша сладкий лапулечек");
    }
}
