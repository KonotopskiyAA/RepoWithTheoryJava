package Refleksiya;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflexion {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // Считать название1 и название2 для создания объекта классов,
        // считать название метода, вызвать на объекте первого класса, в качестве аргумента передать объект второго класса.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name1");
        Class classObject1 = Class.forName(scanner.next());
        System.out.println("Name2");
        Class classObject2 = Class.forName(scanner.next());
        System.out.println("Method");
        String methodName = scanner.next();

        Method meth = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("Irisha is super peeps");//Конструктор для второго объекта, принимающий строковые значения.

        meth.invoke(o1, o2);//Вызать метод на объекте о1 с аргументом о2

        System.out.println(o1);
    }
}
