package Refleksiya;

@ReflexAnnotation(name = "Irisha", dateOfCreation = 2001)
public class PersonReflex {
    private int id;
    private String name;

    public PersonReflex(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public PersonReflex() {

    }
    public static void say() {
        System.out.println("Irisha one love!");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonReflex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

