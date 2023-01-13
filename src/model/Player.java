package model;

public class Player
{

    public Player(String name, long age, long height, long weight, String nationality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Nationality = nationality;
    }

    public Player(String name, long age, long height, long weight, String nationality, int team_id) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Nationality = nationality;
        this.team_id = team_id;
    }

    public Player(String name, long age, long height, long weight, String nationality, int id, int team_id ) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Nationality = nationality;
        this.id = id;
        this.team_id = team_id;
    }

    public Player() {
    }

    private String name;
    private long age;
    private long height;
    private long weight;
    private String Nationality;
    private int id;
    private int team_id;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", Nationality='" + Nationality + '\'' +
                ", id=" + id +
                ", team_id=" + team_id +
                '}';
    }
}

