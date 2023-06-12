package Annotacii;

import Annotacii.MyAnnotation;

public class TestLocalAnnotation {
    @MyAnnotation(author = "Ириша", dateOfCreation = 2023, purpose = "Быть суперпирожочком")
    public void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
