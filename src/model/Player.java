package model;

public class Player {
    public Player(String name, int age, float height, int weight, String nationality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Nationality = nationality;
    }

    public Player() {
    }

    private String name;
    private int age;
    private float height;
    private int weight;
    private String Nationality;


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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }
}

