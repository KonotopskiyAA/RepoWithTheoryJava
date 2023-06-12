package base.cycles;

public class Arrays_of_string_withForEach {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "Привет";
        strings[1] = "Как дела";
        strings[2] = "Что делаешь";
        strings[3] = "Что новго";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String nameValue:strings){ //1-Тип, 2-Имя переменной, 3-массив, который перебираем.
            System.out.println(nameValue);
        }
        int [] chisla = {1,2,3};
        int summa = 0;
        for (int x: chisla){
            summa = summa+x;
        }
        System.out.println();
        System.out.println(summa);
    }
}
