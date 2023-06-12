package pro_lyambdy1.variable;

interface Executable1 {
    int execute(int x, int y);
}

class Runner1 {
    public void run(Executable1 e) {
       int a = e.execute(10, 12);
        System.out.println(a);
    }
}


public class Lesson_1_1 {
    public static void main(String[] args) {
        Runner1 runner = new Runner1();
        runner.run(new Executable1() { //Через анонимный класс
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello from anonim klass");

                return x + y;
            }
        });
        runner.run((x, y) -> {// не указываем тип возвращаемого значения.
            // runner.run(() -> 10; - вернуть целое число
            System.out.println("Hello from lyambda");

            return x + y;

        });

    }
}