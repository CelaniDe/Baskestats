package model;

public class Team
{
    private int id;
    private String name;
    private String city;
    private long founded;
    private String CEO;

    public Team() {}

    public Team(int id,String name, String city, long founded, String CEO) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.founded = founded;
        this.CEO = CEO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public long getFounded()
    {
        return founded;
    }

    public void setFounded(long founded)
    {
        this.founded = founded;
    }

    public String getCEO()
    {
        return CEO;
    }

    public void setCEO(String CEO)
    {
        this.CEO = CEO;
    }
}
