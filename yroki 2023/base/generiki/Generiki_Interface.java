package base.generiki;

public class Generiki_Interface {
    public static void main(String[] args) {

        Accountable<String> acc1 = new Acount("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
interface Accountable<T>{//class Account<T, S> - задать сразу несколько универсальных параметров
    T getId();
    int getSum();
    void setSum(int sum);
}
class Acount implements Accountable<String>{ //Обобщенный интерфес с конкретной реализацией
    // если сделать так: class Account<T> implements Accountable<T> - метод с обобщенным параметром

    private String id;
    private int sum;

    Acount(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
