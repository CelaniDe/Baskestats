package model;

public class Player {
    public Player(String name, long age, long height, long weight, String nationality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Nationality = nationality;
    }

    public Player() {
    }

    private String name;
    private long age;
    private long height;
    private long weight;
    private String Nationality;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWeight() {
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

