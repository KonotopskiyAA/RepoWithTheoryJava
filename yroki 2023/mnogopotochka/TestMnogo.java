package mnogopotochka;

public class TestMnogo {// В java - виртуальная парралельность. Переключение между участками кода для одного ядра.
    // Для нескольких ядер - равномерное распределение.
    // main - первый поток программы.
    // Потоки в java не синхронизированны.
    public static void main(String[] args) throws InterruptedException {// Новые потоки создаются из потока main.
        MyThread myThread = new MyThread();
        myThread.start(); // Запустить поток

        MyThread myThread1 = new MyThread();

        Thread.sleep(3000);// Сон на заданный промежуток. В миллисекундах. Используется в любых потоках.

        System.out.println("Hello from main thread after sleep");

        Thread thread = new Thread(new RunnerPotok()); // Передаем объект класса RunnerPotok при создании потока thread.
        thread.start();
    }
}
class RunnerPotok implements Runnable { // Наследовать интерфейс Runnable
    public void run(){
        for(int i =0; i < 100; i++){
            System.out.println("Hello from my Second Thread, Irisha");
        }
    }
}
class MyThread extends Thread {// Наследование от класса thread. Первый способ создания потока.
    public void run(){// В этом методе код для потока. В методе run - создает новый поток.
        for(int i =0; i < 100; i++){
            System.out.println("Hello from my First Thread, Irisha");
        }
    }
}