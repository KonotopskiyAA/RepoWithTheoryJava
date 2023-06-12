package base.generiki;

public class Generik {
    public static void main(String[] args) {

        Account<String> acc1 = new Account<String>("2345", 5000); //работают только с объектами, но не работают с примитивными типами
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
class Account<T>{//<T> - универсальный параметр
    //в классе Account задается универсальный параметр
    //в psvm конкретизируется тип переменной

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}