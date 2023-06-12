package base.lesson37_40_exceptions;

import java.io.FileNotFoundException;

public class ExceptionExample40 { //исключений может быть сколько угодно
    public static void main(String[] args) throws Exception {
        run();

    }
    public static void run() throws Exception, FileNotFoundException {
        System.out.println("Ты бежишь в рамках метода run");

    }
}
