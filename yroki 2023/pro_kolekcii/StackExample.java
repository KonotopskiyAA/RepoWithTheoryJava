package pro_kolekcii;

import java.util.Stack;

public class StackExample { //реализует интерфейс Лист и наследуется от Vector(который равен ArrayList).
    // Stack - последний пришел, первый ушел.
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(3);//Добавляет объект в стек
        stack.push(2);
        stack.push(4);

       // System.out.println(stack.pop());//Извлечь последний добавленный элемент из стека
       // System.out.println(stack.peek());//Показать последний добавленный элемент

        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
