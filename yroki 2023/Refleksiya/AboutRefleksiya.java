package Refleksiya;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Period;
import java.util.Arrays;

public class AboutRefleksiya {//Рефлексия - это механизм исследования данных о программе во время её выполнения.
    // Рефлексия позволяет исследовать информацию о полях, методах и конструкторах классов.
    // Рефлексия учитывает инкапсуляцию.
    // getDeclaredFields - вернет все поля, даже приватные.
    // Рефлексия позволяет поработать с классом как с объектом класса Class.
    // С помощью рефлексии можно создать новый объект класса, чей объект класса Class мы вызвали - newInstance().
    // Получать методы по сигнатуре - getMethod();
    // Получать конструктор по сигнатуре - getConstructor();
    public static void main(String[] args) throws ClassNotFoundException {
        PersonReflex personReflexObj = new PersonReflex();

        Class personClass = PersonReflex.class;// первый способ. Рефлексия - класс PersonReflex воспринимаем как объект класса Class.
        Class personClass1 = personReflexObj.getClass();// второй способ.
        Class personClass2 = Class.forName("Refleksiya.PersonReflex");// третий способ.

        Method[] methods = personClass.getMethods(); // Вернет все методы для класса.
        for(Method method : methods) {
            System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
        }

        Field[] fields = personClass1.getDeclaredFields();// Вернет все поля класса.
        for(Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }
        Annotation[] annotations = personClass2.getAnnotations();
        for(Annotation annotation : annotations) {
            if (annotation instanceof ReflexAnnotation) {
                System.out.println("Yes");
            }
        }
}
}
