package Annotacii;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//к чему может быть применена аннотация.
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {//Как создать свою аннотацию.
    // Своя аннотация нужна для реализации собственного анализатора исходного кода.
    // При реализации своей библиотеки или фреймворка.
    // У аннотаций могут быть поля, но объявляются как методы.
    // default - значение по умолчанию.
    // @Target - к чему применена аннотация.
    // @Retention - политика удержания аннотации(до какого этапа видна), где SOURCE - отбрасывается при компиляции(анализатор исходного кода),
    // CLASS - сохраняются в байт-коде, но недоступны во время работы программы(анализатор байт-кода),
    // RUNTIME - сохраняются в байт-коде и доступны во время работы программы(для рефлексии).
    String author();
    int dateOfCreation();
    String purpose();
    String lovelePirozhochek() default "Irisha";

}
