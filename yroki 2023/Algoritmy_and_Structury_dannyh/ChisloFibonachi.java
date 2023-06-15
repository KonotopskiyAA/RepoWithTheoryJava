package Algoritmy_and_Structury_dannyh;

import java.util.Arrays;

public class ChisloFibonachi {
    public static void main(String[] args) {
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));
        System.out.println(fibEffective(100));

        int n = 100; // переменная, для мемоизации
        long[] memo = new long[n + 1];

        Arrays.fill(memo, -1);

        System.out.println(fibMemo(n, memo));
    }
    private static long fibNaive(int n) { // Примитивный алгоритм. Вызывает огромное количество вызовов.
        // Дублирует вычисление.
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibNaive(n-1) + fibNaive(n-2);
    }

    private static long fibEffective(int n) { // Эффективный алгоритм.
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

            return arr[n];

    }

    private static long fibMemo(int n, long[] memo) { // Примитивный алгоритм + мемо
        // Кэширует вычисление.

        if (memo[n] != -1)
            return memo[n];

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        long resultMemo =  fibMemo(n-1, memo) + fibMemo(n-2, memo);

        memo[n] = resultMemo;

        return resultMemo;
    }
}
