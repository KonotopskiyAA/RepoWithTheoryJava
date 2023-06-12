package base;

public class primitivy_privedenie_obertki_preobrzovanie {
    public static void main(String[] args) {//приведение Не явное (автоматически), явное (вручную)
        int a = 123;
        long l = a; //НеЯвное
        int x = (int)l; //Явное
        int y = 1; //Обертки: Double, Float, Long, Integer, Short, Byte, Character и Boolean
        Integer y2 = new Integer(123);//Методы
        y2.byteValue();
        //Восходящее и низходящее преобразование.\
        //Восходящее преобразование Не явное
        //Низходящее преобразование Явное. Dog dog = (Dog) animal
    }

}
