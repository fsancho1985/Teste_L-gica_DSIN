package entities;

public class Pato {
    private String name;
    private int age;
    private String color;

    public Pato(){}

    public Pato(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void quack() {
        System.out.println("Quack! Quack!");
    }

    public void nadar() {
        System.out.println(name + " está nadando!");
    }

    public void voar() {
        System.out.println(name + " está voando!");
    }

    @Override
    public String toString() {
        return "Nome = " + name +
                ", idade = " + age +
                ", cor = " + color;
    }
}
