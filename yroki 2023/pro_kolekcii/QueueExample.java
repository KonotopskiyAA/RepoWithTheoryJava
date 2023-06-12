package pro_kolekcii;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {// Queue - очередь. Первый вошел - первый выше.
        PersonQ person1 = new PersonQ(1);
        PersonQ person2 = new PersonQ(3);
        PersonQ person3 = new PersonQ(2);
        PersonQ person4 = new PersonQ(4);

        //Queue<PersonQ> peopleQ = new LinkedList<>();// Queue реализует LinkedList.
        Queue<PersonQ> peopleQ = new ArrayBlockingQueue<PersonQ>(10);// Queue реализует ArrayBlockingQueue- есть возможность указать максимальный размер очереди.
        // Число в скобках - размер очереди
        peopleQ.add(person3);
        peopleQ.add(person1);
        peopleQ.add(person2);
        peopleQ.add(person4);//по умолчанию в каком загрузили - в таком выводит.

        //peopleQ.remove() - удаляет первый элемент в очереди
        //peopleQ.peek() - показывает первый элемент в очереди

        for (PersonQ iter : peopleQ)
            System.out.println(iter);



    }
}

class PersonQ {
    private int id;

    public PersonQ(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonQ{" +
                "id=" + id +
                '}';
    }
}