package base.lesson49_rekursiya;

public class Test {// Рекурсивный метод - метод, вызывающий сам себя.
    //stack - информация о вызовах методов.
    public static void main(String[] args) {
        someMethod(3);

    }
    private static void someMethod(int n){
        System.out.println(n);
        if (n==0)
            return;
        someMethod(n-1);
    }
}
