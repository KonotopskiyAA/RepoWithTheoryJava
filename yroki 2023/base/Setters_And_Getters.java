package base;

public class Setters_And_Getters {
    public static void main(String[] args) {
        Person1 personOne = new Person1();
        personOne.setName("Ириша");
        personOne.setAge(21);
        personOne.privetstvie();

    }
}

class Person1 {
   private String name; //private - доступно в пределах класса Person
   private int age;
   public void setName(String username){
       name = username;
   }
   public String getName(){
       return name;
   }
   public void setAge(int userAge){
       age = userAge;
   }

    public int getAge() {
        return age;
    }
    void privetstvie(){
        System.out.println("Меня зовут " +name+" Мне "+age+" лет");
    }
}