package mnogopotochka;

public class MnogoSynchroMetod { // Состояние гонки - два потока пишут в одну переменную не синхронно.
    // Synchronized - два или более потока пишут в одну переменную синхронно
    // Пишется только в методах.
    // Только один поток в момент времени получает доступ к телу метода.
    // Каждому объекту присваивается monitorLock - может быть у одного объекта.
    public int counter;

    public static void main(String[] args) throws InterruptedException {
        MnogoSynchroMetod mnogoSynchroMetod = new MnogoSynchroMetod();
        mnogoSynchroMetod.doDvaPotoka();
    }
    public synchronized void increment(){// Не указываем явно на каком объекте синхронизируемся. К объекту this.
        counter++;
    }
    public void doDvaPotoka() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                  increment();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();// В текущем потоке ждем выполнение потока.
        thread2.join();

        System.out.println(counter);
    }
}


