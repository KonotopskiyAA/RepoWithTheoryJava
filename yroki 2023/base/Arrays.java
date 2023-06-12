package base;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных
        int[] numbers = new int[5]; //ссылочный тип данных. Все элементы массива - ноль по умолчанию
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] numbersManual = {1, 2, 3};
        for (int i = 0; i < numbersManual.length; i++) {
            System.out.println(numbersManual[i]);
        }
    }
}
